package com.samsegun.student.service;

import com.samsegun.student.Student;
import com.samsegun.student.dao.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService{
    @Autowired
    private StudentRepo repo;

    @Override
    public Student saveStudent(Student student) {
        //invoke logic to store data in database
        repo.save(student);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
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
