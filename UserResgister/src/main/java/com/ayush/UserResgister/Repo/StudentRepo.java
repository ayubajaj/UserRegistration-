package com.ayush.UserResgister.Repo;

import com.ayush.UserResgister.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;

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

    public String checkUser(User user) {
        String sql1="select exists (select 1 from users where emailid=?)";
        String sql2="select exists (select 1 from users where emailid=? and password=?)";
            Boolean mailcheck=jdbc.queryForObject(sql1,new Object[]{user.getEmail()},Boolean.class);
            Boolean passwordcheck=jdbc.queryForObject(sql2,new Object[]{user.getEmail(),user.getPassword()},Boolean.class);
            if(!Boolean.TRUE.equals(mailcheck))
            {
                return "data doesn't exist";
            }
            if(Boolean.TRUE.equals(passwordcheck))
            {
                return "welcome";
            }
            else {
                return "wrong password";
            }


    }
    public User getUserByUsername(String username) throws SQLException {


        String sql = "select * from users where emailid=?";
        List <User> details = jdbc.query(
                sql, new PreparedStatementSetter() {

                    public void setValues(PreparedStatement preparedStatement) throws SQLException {
                        preparedStatement.setString(1, username);
                    }
                },
                (rs, rowNum) -> {
                    User u=new User();
                    u.setEmail(rs.getString("emailid"));
                    u.setPassword(rs.getString("password"));
                    return u;

                });

        return details.get(0);


    }
}
