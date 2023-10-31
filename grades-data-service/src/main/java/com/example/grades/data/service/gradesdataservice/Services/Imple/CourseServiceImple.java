package com.example.grades.data.service.gradesdataservice.Services.Imple;

import com.example.grades.data.service.gradesdataservice.DTO.CourseGrade;
import com.example.grades.data.service.gradesdataservice.Models.Course;
import com.example.grades.data.service.gradesdataservice.Models.Grade;
import com.example.grades.data.service.gradesdataservice.Repositories.CourseRepository;
import com.example.grades.data.service.gradesdataservice.Repositories.GradeRepository;
import com.example.grades.data.service.gradesdataservice.Services.Interface.CourseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImple implements CourseServiceInterface {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private GradeRepository gradeRepository;


// all course by course code
//public CourseGrade getCourseByCourseCode(Integer Course_Code){
//    Optional<Course> courseFromDb =  courseRepository.findById(Course_Code);
//    if(courseFromDb.isPresent()){
//        List<Course> courses = courseFromDb.get().getCourses();
//        return new CourseGrade(Course_Code, courses);
//    }
//    else{
//        throw new ResponseStatusException(HttpStatus.NOT_FOUND,"course not found");
//    }
//}
//public void addGradeToCourse(Integer courseCode, Integer gradeValue) {
//    // Find the course by courseCode
//    Course course = courseRepository.findById(courseCode)
//            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Course not found"));
//
//    // Create a new Grade object and associate it with the course
//    Grade grade = new Grade();
//    grade.setGrade(gradeValue);
//    grade.setCourse(course);
//
//    // Save the grade
//    gradeRepository.save(grade);
//}

    @Override
    public CourseGrade getGradesByCourseCode(Integer courseCode) {
        Optional<Course> courseFromDb =  courseRepository.findById(courseCode);
        if(courseFromDb.isPresent()){
            List<Grade> grades = courseFromDb.get().getGrades();
            //return new CourseGrade(coureCode,grades);
            return null;
        }
        else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Sorry, Not found");
        }
    }
    public void addGradeToCourse(Integer ratingId, Integer userId) {
        Course course = courseRepository.findById(userId).get();
        Grade grade = gradeRepository.findById(ratingId).get();
        course.getGrades().add(grade);
        courseRepository.save(course);
    }

}

//    public void addRatingToUser(Integer ratingId, Integer userId) {
//        User user = userRepository.findById(userId).get();
//        Rating rating = ratingRepository.findById(ratingId).get();
//        user.getRatings().add(rating);
//        userRepository.save(user);
//    }
