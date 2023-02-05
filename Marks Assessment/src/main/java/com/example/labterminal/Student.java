package com.example.labterminal;

import java.util.ArrayList;

public class Student<T> {
    String registrationNumber;
    ArrayList<Assessment> list;


    public Student(String registrationNumber, ArrayList<Assessment> list) {
        this.registrationNumber = registrationNumber;
        this.list = list;
    }
}
