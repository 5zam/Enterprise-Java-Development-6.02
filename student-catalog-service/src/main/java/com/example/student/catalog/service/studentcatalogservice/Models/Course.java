package com.example.student.catalog.service.studentcatalogservice.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseCode;
    private String courseName;

    @OneToMany(mappedBy = "course")
    private List<Grade> grades;

}
