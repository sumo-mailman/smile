package com.example.demo.smile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmilesController {
  @GetMapping("/home")
  public Smile create() {
    Smile smile = new Smile(1, true, false);
    return smile;
  }
}
