package com.example.grades.data.service.gradesdataservice;

import com.example.grades.data.service.gradesdataservice.Models.Course;
import com.example.grades.data.service.gradesdataservice.Models.Grade;
import com.example.grades.data.service.gradesdataservice.Repositories.CourseRepository;
import com.example.grades.data.service.gradesdataservice.Repositories.GradeRepository;
import com.example.grades.data.service.gradesdataservice.Services.Imple.CourseServiceImple;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication

public class GradesDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GradesDataServiceApplication.class, args);
	}

//	@Bean
//	CommandLineRunner run(CourseRepository courseRepository, GradeRepository gradeRepository, CourseServiceImple CourseService) {
//		return args -> {
//
////			courseRepository.save(new Course(null,"Java Spring boot",new ArrayList<>()));
//			courseRepository.save(new Course(null,"Java Spring Boot",new ArrayList<>(),new ArrayList<>()));
//			gradeRepository.save(new Grade(null,5,1));
//			gradeRepository.save(new Grade(null,3,2));
//
//			CourseService.addGradeToCourse(1, 1);
//			CourseService.addGradeToCourse(2, 1);
//
//
//		};
//	}

	@Bean
	CommandLineRunner run(CourseRepository courseRepository, GradeRepository gradeRepository, CourseServiceImple courseService) {
		return args -> {
			// Save a course
			Course course = new Course();
			course.setCourseCode(1);
			course.setCourseName("Java Spring Boot");
			courseRepository.save(course);

//			userRepository.save(new User(null,"Ray","Raymond",new ArrayList<>()));
//			ratingRepository.save(new Rating(null,5,"m1"));
//			ratingRepository.save(new Rating(null,3,"m1"));
//
			// Add grades to the course
			courseService.addGradeToCourse(1, 5);
			courseService.addGradeToCourse(1, 3);
		};
	}

}
