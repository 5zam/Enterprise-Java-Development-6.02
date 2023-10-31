package com.example.student.info.service.studentinfoservice.Repositories;


import com.example.student.info.service.studentinfoservice.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
