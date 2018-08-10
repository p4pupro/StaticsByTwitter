package com.rest.api.twitter.Repository;

import com.rest.api.twitter.Model.TwUser;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;


public interface TwUserRepository extends CrudRepository<TwUser, Long> {
  Optional<TwUser> findById(Long id);
}

