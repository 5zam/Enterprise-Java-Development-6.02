package com.example.grades.data.service.gradesdataservice.Repositories;

import com.example.grades.data.service.gradesdataservice.Models.Course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course,Integer> {

    List<Course> findByCourseCode(Integer courseCode);

}
