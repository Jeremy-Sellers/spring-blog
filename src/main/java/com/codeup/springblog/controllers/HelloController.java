package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//any request to /hello will be handled by this entire controller
@RequestMapping("/hello")
public class HelloController {
    //when go to /hello direct request to this controller and run hello function
    @GetMapping()
    @ResponseBody
    public String hello(){
        return "Hello World!";
    }

    //putting name in curly brackets makes system assume it will be a variable
    //if RequestMapping entire class, can use GetMapping("/{name}) instead as function
    //will use the class RequestMapping as its base
//    @GetMapping("/hello/{name}")
//    //responsebody outputs text string to link
//    @ResponseBody
//    public String sayHello(@PathVariable String name)
//    {
//        return "Hello " + name + "!";
//    }

    //when going to /hello/name will attempt to connect to hello.html and display the html
    @GetMapping("/{name}")
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

//    @GetMapping("/random")
//    @ResponseBody
//    public String randomGreeting(){
//        int rnd = new Random().nextInt(names.length);
//        return "Hello " + names[rnd] + "!";
//    }


    @GetMapping("/{name1}/{name2}")
    @ResponseBody
    public String greetTwo(@PathVariable String name1, @PathVariable String name2){
        return "Hello, " + name1 + " and " + name2 + "!";
    }

    @GetMapping("/{name1}/to/{name2}")
    @ResponseBody
    public String oneGreetsAnother(@PathVariable String name1, @PathVariable String name2){
        return name1 + " Says hi to " + name2 + "!";
    }
}
