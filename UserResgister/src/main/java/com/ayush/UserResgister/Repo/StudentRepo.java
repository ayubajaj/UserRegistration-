package com.ayush.UserResgister.Repo;

import com.ayush.UserResgister.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StudentRepo {
    private JdbcTemplate jdbc;

    public void save(User user) {
        String sql;
        sql = "insert into users (emailid, password) values (?,?)";
        int rows =jdbc.update(sql,user.getEmail(),user.getPassword());



    }

    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<User> getAll() {
        return null;
    }
}
