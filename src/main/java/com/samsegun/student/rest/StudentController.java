package com.samsegun.student.rest;

import com.samsegun.student.Student;
import com.samsegun.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private IStudentService service;

    @GetMapping("/")
    public String greet() {
        return "Hey there, Welcome to student Api!";
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {

        List<Student> students = service.getAllStudents();
        return students;
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable Long id) {


        return new Student();
    }

    @PostMapping("/student")
    public Student student(@RequestBody Student student) {
        System.out.println("Student data: " + student);

        Student servicedStudent = service.saveStudent(student);
        return servicedStudent;
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable Long id) {


//        return new ResponseEntity<>(new Student(), HttpStatus.OK);
        return ResponseEntity.noContent().build();
    }

}
