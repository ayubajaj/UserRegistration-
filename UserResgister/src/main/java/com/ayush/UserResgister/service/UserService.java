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

    public void addUser(User user) {
        repo.save(user);
    }

    public List<User> allUsers() {
        return repo.getAll();
    }
}
