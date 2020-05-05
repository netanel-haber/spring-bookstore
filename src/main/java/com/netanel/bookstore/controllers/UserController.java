package com.netanel.bookstore.controllers;

import com.netanel.bookstore.Entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class UserController {
    // @Autowired
    // private PasswordEncoder passwordEncoder;

    @RequestMapping("/signup")
    public String test(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "signup.html";
    }

    @GetMapping(path = "/login")
    public String login() {
        return "login.html";
    }
    
}