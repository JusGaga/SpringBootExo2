package com.example.exercice.services;

import com.example.exercice.models.Student;

import java.util.List;

public interface StudentInterface {
    List<Student> getAllStudent();
    Student getStudentById(int id);

    Student createStudent(Student student);
    Student updateStudentById(int id, Student student);

    Void deleteStudentById(int id);


}
