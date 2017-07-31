package org.launchcode.hellospring.controllers;


import org.springframework.boot
import org.springframework.web.servlet.mvc.Controller;

@Controller
public class HelloController
{
    @RequestMapping
    public String index()
    {
        return "Hello World!";
    }

}
