package com.rocktech.hibernatecourse.repository;

import com.rocktech.hibernatecourse.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

    List<Post> getByUserId(Integer id);
}
