package com.template.spring.service;

import com.template.spring.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
