package com.sakthi.day1.practice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowController
{
    @GetMapping("abi")
    public String hellowController()
    {
        return "welcome";
    }

}
