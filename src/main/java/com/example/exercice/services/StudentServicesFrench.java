package com.example.exercice.services;

import com.example.exercice.models.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServicesFrench implements StudentInterface{
    List<Student> listStudent = new ArrayList<>();

    @Override
    public List<Student> getAllStudent(){
        return listStudent;
    }

    @Override
    public Student getStudentById(int id){
        for (Student student : listStudent) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student getStudentByName(String name){
        for (Student student : listStudent) {
            if (student.getFirstname().equals(name) || student.getLastname().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student createStudent(Student newStudent) {
        int newId = listStudent.stream().mapToInt(Student::getId).max().orElse(0) + 1;
        Student studentToAdd = new Student(newStudent.getFirstname(), newStudent.getLastname(), newStudent.getAge(), newId);
        listStudent.add(studentToAdd);
        System.out.println(listStudent);
        return studentToAdd;
    }

    @Override
    public Student updateStudentById(int id, Student updatedStudent) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                listStudent.set(i, updatedStudent);
                return updatedStudent;
            }
        }
        return null;
    }

    @Override
    public Void deleteStudentById(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                listStudent.remove(i);
                return null;
            }
        }
        return null;
    }


}
