package com.example.grades.data.service.gradesdataservice.DTO;

import com.example.grades.data.service.gradesdataservice.Models.Course;
import com.example.grades.data.service.gradesdataservice.Models.Grade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseGrade {

    private Integer Course_Code;
    private String courseName;

    private List<Grade> grades;
    //private List<Course> courses;


}
