package com.alexq66.thymeleafdemo.controller;

import com.alexq66.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Kenneth Quinn on 2/27/2024
 */

@Controller
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showForm(Model theModel) {

        theModel.addAttribute("student", new Student());

        return "student-form";
    }
}
