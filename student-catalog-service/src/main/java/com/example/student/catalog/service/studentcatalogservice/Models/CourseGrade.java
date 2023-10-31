package com.example.student.catalog.service.studentcatalogservice.Models;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CourseGrade {

    private Integer Course_Code;
    private String courseName;

    private List<Grade> grades;
    //private List<Course> courses;


}
