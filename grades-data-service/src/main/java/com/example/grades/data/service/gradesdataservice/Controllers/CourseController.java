package com.example.grades.data.service.gradesdataservice.Controllers;


import com.example.grades.data.service.gradesdataservice.DTO.CourseGrade;
import com.example.grades.data.service.gradesdataservice.Models.Course;
import com.example.grades.data.service.gradesdataservice.Models.Grade;
import com.example.grades.data.service.gradesdataservice.Repositories.CourseRepository;
import com.example.grades.data.service.gradesdataservice.Repositories.GradeRepository;
import com.example.grades.data.service.gradesdataservice.Services.Imple.CourseServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@RestController
public class CourseController {

    @Autowired
    private CourseServiceImple courseServiceImple;
    @Autowired
    private CourseRepository courseRepository;

    //all courses
    @GetMapping("/courses")
    @ResponseStatus(HttpStatus.OK)
    public List<Course> getCourses(@RequestParam Optional<Integer> courseCode) {
        if (courseCode.isPresent()) {
            return courseRepository.findByCourseCode(courseCode.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Wrong course id")));
        }
        return courseRepository.findAll();
    }

    //get all courses by course code
    @GetMapping("/courses/{courseCode}")
    @ResponseStatus(HttpStatus.OK)
    public Course getCourseById(@PathVariable Integer courseCode) {
        return courseRepository.findById(courseCode).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Wrong course id"));
    }

    //get all grades by course code
    @GetMapping("/courses/{courseCode}/grades")
    @ResponseStatus(HttpStatus.OK)
    public CourseGrade getUserRatings(@PathVariable Integer courseCode) {
        return courseServiceImple.getGradesByCourseCode(courseCode);
    }


    // get all courses1 - first try
//    @GetMapping("/courses")
//    public List<Course> getAllCourses() {
//        return courseRepository.findAll();
//    }

    // get all courses 2
//    @GetMapping("/getCourses")
//    @ResponseStatus(HttpStatus.OK)
//    public Course getUserById(@PathVariable Integer Course_Code) {
//        return courseRepository.findById(Course_Code).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Wrong course code"));
//    }

    // get a course by course code1
//    @GetMapping("/{courseCode}") //different
//    public ResponseEntity<Course> getCourseByCourseCode(@PathVariable Integer courseCode) {
//        Optional<Course> course = courseRepository.findById(courseCode);
//        if (course.isPresent()) {
//            return ResponseEntity.ok(course.get());
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

    //get course by course code2

//    @GetMapping("/courses/{Course_Code}")
//    @ResponseStatus(HttpStatus.OK)
//    public Course getCourseByCourseCode(@PathVariable Integer Course_Code) {
//        return courseRepository.findById(Course_Code).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "course code not found"));
//    }

    // Endpoint to get grades based on course code
//    @GetMapping("/{courseCode}/grades") // Make sure your Grade model has a courseCode property
//    public List<Grade> getGradesByCourseCode(@PathVariable String courseCode) {
//        return gradeRepository.findByCourseCode(courseCode);
//    }

} /** end class */
