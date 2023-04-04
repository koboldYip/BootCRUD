package com.example.bootcrud.service;

import com.example.bootcrud.dao.UserDao;
import com.example.bootcrud.model.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    private UserDao dao;

    public UserServiceImp(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void add(User user) {
        dao.save(user);
    }

    @Override
    public User getById(Long id) {
        return dao.getReferenceById(id);
    }

    @Override
    public void update(User user) {
        User userDb = dao.getReferenceById(user.getId());
        userDb.setFirstName(user.getFirstName());
        userDb.setLastName(user.getLastName());
        userDb.setEmail(user.getEmail());
    }

    @Override
    public void delete(User user) {
        dao.deleteById(user.getId());
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return dao.findAll();
    }
}
