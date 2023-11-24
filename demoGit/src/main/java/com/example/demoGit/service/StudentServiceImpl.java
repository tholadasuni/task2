package com.example.demoGit.service;

import com.example.demoGit.model.Student;
import com.example.demoGit.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;


    @Override
    public List<Student> getAllStudents() {
             return (List<Student>) studentRepo.findAll();
    }


    @Override
    public void deleteStudentById(Integer ID){
        studentRepo.deleteById(ID);
    }

    @Override
    public Student save(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public void update(Student student) {
        Student s = new Student();
        s.setName(student.getName());
        s.setAge(student.getAge());
        s.setSalary(student.getSalary());
        studentRepo.save(student);
    }

}