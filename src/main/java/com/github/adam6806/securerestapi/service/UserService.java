package com.github.adam6806.securerestapi.service;

import com.github.adam6806.securerestapi.model.User;
import com.github.adam6806.securerestapi.model.UserDto;

import java.util.List;

public interface UserService {

    User save(UserDto user);

    List<User> findAll();

    void delete(long id);

    User findOne(String username);

    User findById(Long id);
}
