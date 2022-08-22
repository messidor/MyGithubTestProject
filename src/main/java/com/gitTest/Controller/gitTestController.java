package com.gitTest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gitTestController {
    @GetMapping("/")
    public String helloWorld(){
        return "Todo Application!!";
    }
}
