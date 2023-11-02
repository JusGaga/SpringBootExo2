package com.example.exercice.controllers;

import com.example.exercice.models.Student;
import com.example.exercice.services.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    private final StudentInterface studentService;

    @Autowired
    public StudentController(StudentInterface studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public String home(){
        return "home";
    }

    @PostMapping("/student/create")
    public String studentSubmitForm(@ModelAttribute("studentSubmit") Student student){
        studentService.createStudent(student);

        return "redirect:/student/list";
    }

    @GetMapping("/student/list")
    public String studentList(Model model){
        List<Student> listStudent =  studentService.getAllStudent();
        model.addAttribute("listStudent", listStudent);

        return "student/list";
    }

    @GetMapping("/student")
    public String studentDetails(@RequestParam String name, Model model){
        Student studentWant = studentService.getStudentByName(name);

        model.addAttribute("studentWant", studentWant);

        return "student/details";
    }
    @GetMapping("/student/form")
    public String studentForm(Model model){
        Student student = new Student();
        model.addAttribute("studentSubmit", student);
        return "student/form";
    }

}
