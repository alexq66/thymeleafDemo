package com.alexq66.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Kenneth Quinn on 2/27/2024
 */

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String upperCaseName(HttpServletRequest request, Model model) {
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Welcome! " + theName;
        model.addAttribute("message", result);
        return "helloworld";
    }

    @RequestMapping("/processFormVersionThree")
    public String upperCaseNameTwo(@RequestParam("studentName") String theName, Model model) {
        theName = theName.toUpperCase();
        String result = "Welcome! " + theName;
        model.addAttribute("message", result);
        return "helloworld";
    }

}
