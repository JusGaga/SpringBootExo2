package com.example.exercice.services;

import com.example.exercice.models.Student;

import java.util.List;

public interface StudentInterface {
    String showStudent(Student student);
    String showMultipleStudent(List<Student> students);
}
