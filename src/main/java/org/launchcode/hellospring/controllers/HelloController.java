package org.launchcode.hellospring.controllers;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@org.springframework.stereotype.Controller
public class HelloController
{
    @RequestMapping(value = "")
    @ResponseBody
    public String index()
    {
        return "Hello World!";
    }
    @RequestMapping(value = "Goodbye")
    @ResponseBody
    public String goodbye()
    {
        return "Goodbye";
    }
}
