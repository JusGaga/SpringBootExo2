package com.example.exercice.services;

import com.example.exercice.models.Student;

import java.util.List;

public interface StudentInterface {
    ///////////////  GET  //////////////////
    List<Student> getAllStudent();
    Student getStudentById(int id);
    Student getStudentByName(String name);

    ///////////////  POST  //////////////////

    Student createStudent(Student student);

    ///////////////  PUT  //////////////////

    Student updateStudentById(int id, Student student);

    ///////////////  DELETE  //////////////////

    Void deleteStudentById(int id);


}
