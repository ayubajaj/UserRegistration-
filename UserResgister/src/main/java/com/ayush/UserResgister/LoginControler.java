package com.ayush.UserResgister;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginControler {

    @RequestMapping("/")
    public String home()
    {
        System.out.println("home page");
        return "login.html";
    }
}
