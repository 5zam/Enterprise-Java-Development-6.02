package com.example.student.catalog.service.studentcatalogservice.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    //Student attributes:
    @Id
    private Integer Student_id;
    private String Student_name;
    private Integer Student_Age;
}