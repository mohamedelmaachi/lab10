package com.demo.eregister.service;

import com.demo.eregister.model.Student;

import java.util.List;

public interface IStudentServcice {
    void registerStudent(Student student);

    List<Student> getStudents();

    void deleteStudent(Long studentId);

    List<Student> filterStudents(String search);

    Student getStudentById(long studentId);

    Student saveStudent(Student student);
}
