package com.springbootcrud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by BSijtsma on 05-06-2016.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "app, reporting for duty";
    }
}
