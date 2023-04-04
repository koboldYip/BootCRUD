package com.example.bootcrud.service;

import com.example.bootcrud.model.User;

import java.util.List;

public interface UserService {


    void add(User user);

    User getById(Long id);

    void update(User user);

    void delete(User user);

    void deleteById(Long id);

    List<User> findAll();

}
