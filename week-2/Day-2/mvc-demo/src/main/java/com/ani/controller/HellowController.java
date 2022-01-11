package com.ani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HellowController
{
    @GetMapping("/login")
    public String login()
    {
        return "login";
    }

}
