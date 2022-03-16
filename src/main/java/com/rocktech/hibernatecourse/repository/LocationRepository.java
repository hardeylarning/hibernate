package com.rocktech.hibernatecourse.repository;

import com.rocktech.hibernatecourse.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
}
