package com.samsegun.student.rest;

import com.samsegun.student.Student;
import com.samsegun.student.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "//paste client url here")
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
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student stu = service.getStudentById(id);
        return ResponseEntity.ok(stu);
    }

    @PostMapping("/student")
    public Student student(@RequestBody Student student) {
        System.out.println("Student data: " + student);

        Student servicedStudent = service.saveStudent(student);
        return servicedStudent;
    }

    @DeleteMapping("/student/{id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable Long id) {

        service.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

}
