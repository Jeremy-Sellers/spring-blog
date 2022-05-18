package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//RequestMapping is the url to go to to get results

@Controller
@RequestMapping("/partials")
public class PartialsController {
    @GetMapping
    public String showPartialsTest(){
        //this is the file displayed when going to /partials
        return "partials-test";
    }
}
