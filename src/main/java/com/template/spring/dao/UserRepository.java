package com.template.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.template.spring.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
