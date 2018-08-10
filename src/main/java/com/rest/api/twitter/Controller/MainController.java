package com.rest.api.twitter.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @RequestMapping("/showchart")
  public String showchart(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
    return "showchart";
  }

  @RequestMapping("/showlinechart")
  public String showLineChart(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
    return "showlinechart";
  }

}