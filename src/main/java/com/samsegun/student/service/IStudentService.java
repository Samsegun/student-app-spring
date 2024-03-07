package com.samsegun.student.service;

import com.samsegun.student.Student;

import java.util.List;

public interface IStudentService {

    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudentById(Student student);
    public Student deleteStudentById(Student student);
}
