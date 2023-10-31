package com.example.grades.data.service.gradesdataservice.Repositories;

import com.example.grades.data.service.gradesdataservice.Models.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GradeRepository extends JpaRepository<Grade, Integer> {
    List<Grade> findByCourseCode(String courseCode);

    List<Grade> findAll(Long id);
}
