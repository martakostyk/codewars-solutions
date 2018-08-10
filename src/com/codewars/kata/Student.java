package com.codewars.kata;

class Student {

    int gpa;
    int age;
    String fullName;

    public Student(int age, int gpa, String fullName) {
        this.gpa = gpa;
        this.age = age;
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public int getGpa() {
        return gpa;
    }
}
