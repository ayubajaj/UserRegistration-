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
    public String save(User user) throws Exception {
        String sql;
        sql = "insert into users (emailid, password) values (?,?)";
       int row =jdbc.update(sql,user.getEmail(),user.getPassword());
           return row+" "+"updated";





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
