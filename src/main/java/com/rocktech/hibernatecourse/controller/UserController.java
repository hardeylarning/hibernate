package com.rocktech.hibernatecourse.controller;

import com.rocktech.hibernatecourse.model.Post;
import com.rocktech.hibernatecourse.model.User;
import com.rocktech.hibernatecourse.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("user/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("user/{id}/posts")
    public List<Post> getPostsByUser(@PathVariable Integer id){
        Optional<User> user = userService.getUserById(id);
        return user.map(User::getPosts).orElse(null);
    }

    @GetMapping("users/location/{id}/users")
    public List<User> getUsersByLocation(@PathVariable Integer id){
        return userService.findByLocationId(id);
    }

    @PostMapping("user/add-new")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @PutMapping("users/{id}/update")
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }

    @DeleteMapping("users/{id}/delete")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }

}
