package com.loxmeetsbagel.api.health;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/health")
    public String index() {
        return "Hello World!";
    }
}
