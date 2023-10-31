package com.example.exercice.controllers;

import com.example.exercice.models.Student;
import com.example.exercice.services.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentRestController {

    private final StudentInterface studentService;

    @Autowired
    public StudentRestController(StudentInterface studentService){
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }
    @GetMapping("/search/{id}")
    public Student getOneStudent(@PathVariable int id) {
        return studentService.getStudentById(id);
    }
    @GetMapping("/search")
    public Student getOneStudentByName(@RequestParam("name") String name){
        return studentService.getStudentByName(name);
    }
    @PostMapping("/create")
    public Student addStudent(@RequestBody Student newStudent) {
        return studentService.createStudent(newStudent);
    }
    @PutMapping("/{id}/update")
    public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        return studentService.updateStudentById(id,updatedStudent);
    }
    @DeleteMapping("/{id}/delete")
    public Void deleteStudent(@PathVariable int id) {
        return studentService.deleteStudentById(id);
    }

}
