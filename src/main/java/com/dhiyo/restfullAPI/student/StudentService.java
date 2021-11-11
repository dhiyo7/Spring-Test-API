package com.dhiyo.restfullAPI.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents () {
        return List.of(
                new Student(
                        1L,
                        "Dhiyo New Service",
                        "dhiyo@mail.com",
                        LocalDate.of(1998, Month.FEBRUARY,12),
                        23
                )
        );
    }
}
