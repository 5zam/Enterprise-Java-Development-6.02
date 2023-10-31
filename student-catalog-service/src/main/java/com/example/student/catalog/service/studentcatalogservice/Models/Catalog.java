package com.example.student.catalog.service.studentcatalogservice.Models;


import jakarta.persistence.Entity;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
//@Entity
public class Catalog {
    // Catalog attributes:
    private String courseName;
    private List<StudentGrade> studentGrades;
}
