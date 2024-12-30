package com.ayush.UserResgister.service;

import com.ayush.UserResgister.Repo.StudentRepo;
import com.ayush.UserResgister.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    StudentRepo repo;

    public StudentRepo getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepo repo) {
        this.repo = repo;
    }

    public String addUser(User user) {
        try {
            return repo.save(user);
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    public List<User> allUsers() {
        return repo.getAll();
    }

    public String checkUser(User user) {
        try {
            return repo.checkUser(user);
        } catch (Exception e) {
            return e.getMessage();
        }

    }
}
