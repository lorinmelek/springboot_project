package com.lorin.SpringProject;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController
{
    @RequestMapping("home")

    public String home(String name, HttpSession session)
    {
        System.out.println("hi " + name);
        session.setAttribute("name", name);//fetching the name of a client from server by adding line of code to html file
        return "home";
    }
}