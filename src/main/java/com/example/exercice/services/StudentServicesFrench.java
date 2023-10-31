package com.example.exercice.services;

import com.example.exercice.models.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServicesFrench implements StudentInterface{

    @Override
    public String showStudent(Student student) {
        return "Votre étudiant est " + student.getFirstname() + student.getLastname() + " il est agé de " + student.getAge();
    }

    @Override
    public String showMultipleStudent(List<Student> students) {
        StringBuilder result = new StringBuilder("Voici la liste d'étudiants : \n");
        for (Student student : students) {
            String fullName = student.getFirstname() + " " + student.getLastname();
            int age = student.getAge();
            result.append("Nom: ").append(fullName).append(", Age: ").append(age).append("\n");
        }
        return result.toString();
    }


}
