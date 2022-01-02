package com.example.gatewaydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Nagaraj SH on 01-01-2022.
 */
@RestController
@RequestMapping("/nt-ms1")
public class HelloController {

    @GetMapping("/get")
    public String getSomething() {
        return "Hello";
    }
}
