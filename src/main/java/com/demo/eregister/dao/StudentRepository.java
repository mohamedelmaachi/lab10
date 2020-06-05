package com.demo.eregister.dao;

import com.demo.eregister.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Query("SELECT s FROM Student s WHERE CONCAT(s.studentId, ' '" +
            ", s.studentNumber,' '" +
            ",s.FirstName,' '" +
            ",s.MiddleName,' '" +
            ",s.LastName,' '," +
            "s.cgpa,' '," +
            "s.enrollmentDate,' '," +
            "s.isInternational,' ' ) LIKE CONCAT('%', :search, '%')")
    List<Student> searchByString(@Param("search") String search);

}
