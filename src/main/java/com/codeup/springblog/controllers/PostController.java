package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/posts")
public class PostController {

    @GetMapping
    @ResponseBody
    public String allPosts(){
        return "Viewing all posts";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public String individualPost(@PathVariable int id){
        return "viewing post based on post id: " + id;
    }

    @GetMapping("/create")
    @ResponseBody
    public String createPost(){
        return "Viewing Creat Post form";
    }

    @PostMapping("/create")
    @ResponseBody
    public String submitPost() {
        return "Submit post!";
    }
}
