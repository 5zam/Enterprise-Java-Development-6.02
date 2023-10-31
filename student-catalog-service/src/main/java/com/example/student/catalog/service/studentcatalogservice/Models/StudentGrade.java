package com.example.student.catalog.service.studentcatalogservice.Models;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public class StudentGrade {

    private String studentName;
    private int studentAge;
    private double grade;
}
