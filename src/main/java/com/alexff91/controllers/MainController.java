package com.alexff91.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Александр on 15.04.2017.
 */
@RestController
public class MainController {
  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "Hello to the main page of Intelligent Controller";
  }
}
