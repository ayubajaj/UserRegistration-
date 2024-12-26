package com.ayush.UserResgister.Repo;

import com.ayush.UserResgister.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Component
public class StudentRepo {
    private JdbcTemplate jdbc;
    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
    public JdbcTemplate getJdbc() {
        return jdbc;
    }
    public void save(User user) {
        String sql;
        sql = "insert into users (emailid, password) values (?,?)";
        int rows =jdbc.update(sql,user.getEmail(),user.getPassword());



    }




    public List<User> getAll() {
        String sql="select * from users";

        RowMapper<User>mapper=new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User u=new User();
                u.setEmail(rs.getString("emailid"));
                u.setPassword(rs.getString("password"));
                return u;

            }
        };

        return jdbc.query(sql,mapper);

    }
}
