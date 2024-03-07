package com.samsegun.student.service;

import com.samsegun.student.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{
    @Override
    public Student saveStudent(Student student) {

        //invoke logic to store data in database

        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentById(Student student) {
        return null;
    }

    @Override
    public Student deleteStudentById(Student student) {
        return null;
    }
}
