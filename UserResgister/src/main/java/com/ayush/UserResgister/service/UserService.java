package com.ayush.UserResgister.service;

import com.ayush.UserResgister.Repo.StudentRepo;
import com.ayush.UserResgister.model.User;
import com.ayush.UserResgister.model.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private StudentRepo repo;

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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user= null;
        try {
            user = repo.getUserByUsername(username);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(user==null)
        { System.out.println("User 404");
            throw new UsernameNotFoundException("User 404");

        }
        return new UserPrincipal(user);
    }
}
