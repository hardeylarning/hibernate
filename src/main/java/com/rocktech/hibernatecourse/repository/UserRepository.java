package com.rocktech.hibernatecourse.repository;


import com.rocktech.hibernatecourse.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findByLocationId(Integer id);
}
