package com.demo.eregister.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
public class Student {
    public enum options {
        NO,
        YES
    }


    @Id
    @GeneratedValue
    private Long studentId;
    @NotNull
    private Long studentNumber;
    @NotNull
    private String FirstName;
    private String MiddleName;
    @NotNull
    private String LastName;
    private Double cgpa;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private LocalDate enrollmentDate;
    @NotNull
    private options isInternational;

    public Student() {
    }

    public Student(@NotNull Long studentNumber, @NotNull String firstName, String middleName, @NotNull String lastName, Double cgpa, @NotNull LocalDate enrollmentDate, @NotNull options isInternational) {
        this.studentNumber = studentNumber;
        FirstName = firstName;
        MiddleName = middleName;
        LastName = lastName;
        this.cgpa = cgpa;
        this.enrollmentDate = enrollmentDate;
        this.isInternational = isInternational;
    }

    public Long getStudentId() {
        return studentId;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public String getLastName() {
        return LastName;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public options getIsInternational() {
        return isInternational;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setIsInternational(options isInternational) {
        this.isInternational = isInternational;
    }
}
