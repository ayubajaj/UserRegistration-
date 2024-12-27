package com.ayush.UserResgister;

import com.ayush.UserResgister.model.User;
import com.ayush.UserResgister.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginControler {
    @Autowired
    UserService service;
    @RequestMapping("/")
    public String home()
    {
        System.out.println("home page");
        return "login.jsp";
    }
    @RequestMapping("add")
    public String req(HttpServletRequest req)
    {  User user=new User();

      user.setEmail(req.getParameter("email"));
     user.setPassword(req.getParameter("password"));
       service.addUser(user);
        return "Confirm.jsp";
    }
}
