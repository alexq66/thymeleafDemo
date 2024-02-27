package com.alexq66.thymeleafdemo.controller;

import com.alexq66.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/processStudentForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        return "student-confirmation";
    }
}
