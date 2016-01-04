package com.serious.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zzz on 1/2/16.
 */
@RestController
@EnableAutoConfiguration
public class Index {
    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }






}
