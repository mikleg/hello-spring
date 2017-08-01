package org.launchcode.hellospring.controllers;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@org.springframework.stereotype.Controller

public class HelloController
{
    @RequestMapping(value = "")
    @ResponseBody
    public String index(HttpServletRequest request)
    {
        String userName = request.getParameter("name");
        if (userName == null)
        {userName = "world";}
        return "Hello " + userName + "!";
    }

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public String helloForm(){
        String html = "<form method='post'>" +
                "<input type='text' name='name' />" +
                "<select name='select'> " +
                "  <option value='Привет '>Russian</option> " +
                "  <option value='Hello ' selected>English</option>" +
                "  <option value='Hallo '>German</option>" +
                "  <option value='Bonjour '>French</option>" +                "  <option value=\"ger\">ger</option>\n" +
                "  <option value='Hola '>Spanish</option>" +
                "</select>"+
                "<input type='submit' value='Greet Me!'/>" +
                "</form>";
        return html;
    }

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public String helloPost(HttpServletRequest request){
        String name = request.getParameter("name");
        String greeting = request.getParameter("select");
        return greeting + name;
    }

    @RequestMapping(value = "goodbye")
    @ResponseBody
    public String goodbye()
    {
        return "Goodbye";
    }
}
