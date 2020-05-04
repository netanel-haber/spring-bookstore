package com.netanel.bookstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MiscController {
    @GetMapping(path = "/")
    public String index() {
        return "index.html";
    }

    @GetMapping(path = "/403")
    public String forbidden() {
        return "403.html";
    }

    @GetMapping(path = "/login")
    public String login() {
        return "login.html";
    }
}