package com.example.student.catalog.service.studentcatalogservice.Controllers;



import com.example.student.catalog.service.studentcatalogservice.Models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CatalogController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/catalogs/course/{courseCode}")
    @ResponseStatus(HttpStatus.OK)
    public Catalog getCatalog(@PathVariable Integer courseCode) {

        Course course = restTemplate.getForObject("http://grades-data-service/api/courses/" + courseCode, Course.class);
        CourseGrade courseGrade = restTemplate.getForObject("http://grades-data-service/api/courses/" + courseCode + "/grades", CourseGrade.class);

        Catalog catalog = new Catalog();
        catalog.setCourseName(course.getCourseName());
        List<StudentGrade> studentGrade = new ArrayList<>();

        //Loop over all course grades and get the student information for each grade
        for (Grade grade : courseGrade.getGrades()) {
            Student student = restTemplate.getForObject("http://student-info-service/api/students/" + grade.getStudent_id(), Student.class);
            studentGrade.add(new StudentGrade(student.getStudent_name(), student.getStudent_Age(), grade.getGrade()));
        }

        catalog.setStudentGrades(studentGrade);
        return catalog;
    }

}
