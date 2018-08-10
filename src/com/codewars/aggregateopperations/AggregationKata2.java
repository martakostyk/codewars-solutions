package com.codewars.aggregateopperations;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregationKata2 {

    public static Map<String, Long> getNumberOfStudentsByDepartment(Stream<Student> students) {

        return students
                .map(Student::getDepartment)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}
