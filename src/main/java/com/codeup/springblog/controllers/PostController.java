package com.codeup.springblog.controllers;


import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {
    //Dependency injection
    private PostRepository postsDao;

    public PostController(PostRepository postsDao){
        this.postsDao = postsDao;
    }
    //Dependency injection

    //maps to posts directory index file

    public List<Post> generatePosts(Model model){
        //create a list of new posts from Post.java class
        List<Post> allPosts = postsDao.findAll();
        Post post1 = new Post(1,"first post","This is the first post");
        Post post2 = new Post(2,"Second post","This is the second post");
        Post post3 = new Post(3,"Third post","this is the third post");

        //add posts created to list
        allPosts.add(post1);
        allPosts.add(post2);
        allPosts.add(post3);

        return allPosts;
    }

    @GetMapping
    public String allPosts(Model model){
        List<Post> allPosts = postsDao.findAll();
        model.addAttribute("allPosts",allPosts);
        return "posts/index";
    }

    //maps to posts/show when directing to /posts/#
    @GetMapping("/{id}")
    public String individualPost(@PathVariable long id, Model model){
        Post post = postsDao.findById(id);
        //assign post attributes to "post" for show.html
        model.addAttribute("post",post);
        return "posts/show";
    }

    @GetMapping("/create")
    public String createPost(){
        return "/posts/create";
    }

    @PostMapping("/create")
    public String submitPost(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body) {
        Post post = new Post(title,body);
        postsDao.save(post);
        return "redirect:/posts";
    }
}
