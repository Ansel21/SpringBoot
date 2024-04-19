package com.anselcodes.ansel.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnselController {
    @GetMapping("/hello")
    public String print(){
      return "Hello Ansel Evander";
    }
}
