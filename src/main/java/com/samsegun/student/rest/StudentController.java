package com.samsegun.student.rest;

import com.samsegun.student.Student;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/")
    public String greet() {
        return "Hello world!";
    }

    @PostMapping("/student")
    public Student student(@RequestBody Student student) {
        System.out.println("Student data: " + student);
        return student;
    }

}
