package com.rocktech.hibernatecourse.controller;

import com.rocktech.hibernatecourse.model.Post;
import com.rocktech.hibernatecourse.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("posts")
    public List<Post> getPosts(){
        return postService.getPosts();
    }

    @GetMapping("post/{id}")
    public Optional<Post> getPostById(@PathVariable Integer id){
        return postService.getPostById(id);
    }

    @GetMapping("posts/user/{id}/posts")
    public List<Post> getPostsByUser(@PathVariable Integer id){
        return postService.getPostsByUser(id);
    }

    @PostMapping("post/add-new")
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }

    @PutMapping("posts/{id}/update")
    public void updatePost(@RequestBody Post post){
        postService.updatePost(post);
    }

    @DeleteMapping("posts/{id}/delete")
    public void deletePost(@PathVariable Integer id){
        postService.deletePost(id);
    }
}
