package com.demo.eregister.service;


import com.demo.eregister.dao.StudentRepository;
import com.demo.eregister.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;

@Service
public class StudentService implements IStudentServcice {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void registerStudent(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return this.studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Long studentId) {
        this.studentRepository.deleteById(studentId);
    }

    @Override
    public List<Student> filterStudents(String search) {
        List<Student> students =this.studentRepository.searchByString(search.trim());

       return students;
    }

    @Override
    public Student getStudentById(long studentId) {
        return this.studentRepository.getOne(studentId);
    }

    @Override
    public Student saveStudent(Student student) {
        return this.studentRepository.save(student);    }
}
