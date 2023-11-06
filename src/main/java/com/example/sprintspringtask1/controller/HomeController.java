package com.example.sprintspringtask1.controller;


import com.example.sprintspringtask1.db.DbManager;
import com.example.sprintspringtask1.modals.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHome(Model model){
        List<Student> students=DbManager.getStudents();
        model.addAttribute("students",students);
        return "home";
    }
    @GetMapping("/add-student")
    public String addStudentPage(){
        return "addStudent";
    }


    @PostMapping("/add-student")
    public String addStudent(Student student){
        DbManager.addStudent(student);
        return "redirect:/";
    }
}
