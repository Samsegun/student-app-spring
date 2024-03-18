package com.samsegun.student.service;

import com.samsegun.student.Student;
import com.samsegun.student.dao.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService{
    @Autowired
    private StudentRepo repo;

    @Override
    public Student saveStudent(Student student) {
        //invoke logic to store data in database
        return repo.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        Optional<Student> optional = repo.findById(id);
        return optional.get();
    }

    @Override
    public void deleteStudentById(Long id) {
        repo.deleteById(id);
    }
}
