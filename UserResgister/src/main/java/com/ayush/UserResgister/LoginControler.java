package com.ayush.UserResgister;

import com.ayush.UserResgister.model.User;
import com.ayush.UserResgister.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginControler {
    @Autowired
    UserService service;
    @RequestMapping("/")
    public String home()
    {
        System.out.println("home page");
        return "signup";
    }
    @RequestMapping("signup")
    public String signup()
    {

        return "signup";
    }
    @RequestMapping("add")
    public ModelAndView req(@RequestParam("email") String email, @RequestParam("password") String password, ModelAndView mv)
    {  User user=new User();

      user.setEmail(password);
     user.setPassword(password);
     String result =service.addUser(user);
     mv.addObject("result",result);
     mv.setViewName("Confirm");
     return mv;
    }
}
