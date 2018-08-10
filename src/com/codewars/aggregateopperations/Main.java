package com.codewars.aggregateopperations;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student[] students;

        Student galina = new Student("Galina", 95, "Philology", Student.Gender.FEMALE);
        Student anton = new Student("Anton", 90, "CS", Student.Gender.MALE);
        Student jack = new Student("Jack", 82, "Philology", Student.Gender.MALE);
        Student mike = new Student("Mike", 60, "Philology", Student.Gender.MALE);
        Student jane = new Student("Jane", 65, "CS", Student.Gender.FEMALE);

        students = new Student[]{galina, anton, jack, mike, jane};

        AggregationKata2.getNumberOfStudentsByDepartment(Arrays.stream(students));
        AggregationKata1.getAverageGradeByDepartment(Arrays.stream(students));
        AggregationKata3.getStudentNamesByDepartment(Arrays.stream(students));
        AggregationKata4.getTheNumberOfStudentsByGenderForEachDepartment(Arrays.stream(students));

    }
}
