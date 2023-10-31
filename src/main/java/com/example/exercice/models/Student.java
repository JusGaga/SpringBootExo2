package com.example.exercice.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {

    private String firstname;
    private String lastname;
    private int age;
    private int id;
}
