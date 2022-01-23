package com.ani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HellowController
{
    @GetMapping("/login")
    public String login()
    {
        return "login";
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String hi() {
        return "index";
    }

    @RequestMapping(value = "/dt", method = RequestMethod.GET)
    public String data() {
        return "data";
    }

}
