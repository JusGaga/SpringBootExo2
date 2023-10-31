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

    Student student1 = new Student("John", "Smith", 9, 1);
    Student student2 = new Student("Elena", "Smith", 12, 2);
    Student student3 = new Student("David", "Smith", 41, 3);
    List<Student> listStudent = List.of(student1,student2,student3);

    @Autowired
    public StudentRestController(StudentInterface studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public String getAllStudents(){
        return studentService.showMultipleStudent(listStudent);
    }

    @GetMapping("/{id}")
    public String  getOneStudent(@PathVariable int id) {
        for (Student student : listStudent) {
            if (student.getId() == id) {
                return studentService.showStudent(student);
            }
        }
        return  "Impossible de trouver l'étudiant avec l'id " + id;
    }

    @PostMapping
    public String addStudent(@RequestBody Student newStudent) {
        int newId = listStudent.stream().mapToInt(Student::getId).max().orElse(0) + 1;
        Student studentToAdd = new Student(newStudent.getFirstname(), newStudent.getLastname(), newStudent.getAge(), newId);
        listStudent.add(studentToAdd);
        return studentService.showMultipleStudent(listStudent);
    }


    @PutMapping("/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                listStudent.set(i, updatedStudent);
                return studentService.showStudent(updatedStudent);
            }
        }
        return "Impossible de trouver l'étudiant avec l'id " + id;
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                listStudent.remove(i);
                return studentService.showMultipleStudent(listStudent);
            }
        }
        return "Impossible de trouver l'étudiant avec l'id " + id;
    }



}
