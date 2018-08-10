package com.rest.api.twitter.Controller;

import com.rest.api.twitter.Model.TwUser;
import com.rest.api.twitter.Repository.TwUserRepository;
import com.rest.api.twitter.exceptions.TwUserIdMismatchException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/tw-users")
public class TweetController {

  @Autowired
  private TwUserRepository twUserRepository;

  @GetMapping
  public Iterable findAll() {
    return twUserRepository.findAll();
  }


  @GetMapping("/tw-user{id}")
  public TwUser findOne(@PathVariable final Long id) {
    return twUserRepository.findById(id).orElseThrow(RuntimeException::new);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public TwUser create(@RequestBody TwUser twUser) {
    return twUserRepository.save(twUser);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    twUserRepository.findById(id).orElseThrow(RuntimeException::new);
    twUserRepository.deleteById(id);
  }

  @PutMapping("/{id}")
  public TwUser updateTwUser(@RequestBody TwUser twUser, @PathVariable Long id) {
    if (twUser.getId() != id) {
      throw new TwUserIdMismatchException("User Twiiter Not Found", null);
    }
    twUserRepository.findById(id).orElseThrow(RuntimeException::new);
    return twUserRepository.save(twUser);
    }
}