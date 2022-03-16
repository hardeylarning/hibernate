package com.rocktech.hibernatecourse.service;

import com.rocktech.hibernatecourse.model.Post;
import com.rocktech.hibernatecourse.model.User;
import com.rocktech.hibernatecourse.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    public Optional<Post> getPostById(Integer id) {
        return postRepository.findById(id);
    }

    public List<Post> getPostsByUser(Integer id) {
        return postRepository.getByUserId(id);
    }

    public void addPost(Post post){
        postRepository.save(post);
    }

    public void updatePost(Post post){
        postRepository.save(post);
    }

    public void deletePost(Integer id){
        postRepository.deleteById(id);
    }
}
