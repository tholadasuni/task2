package com.example.demoGit.service;

import com.example.demoGit.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    void deleteStudentById(Integer ID);

    Student save(Student student);

    void update(Student student);
}
