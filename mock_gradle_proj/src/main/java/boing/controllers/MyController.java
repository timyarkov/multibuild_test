package boing.controllers;

import boing.model.MyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/")
    public MyResponse genericResponse() {
        return new MyResponse("Hello!");
    }
}
