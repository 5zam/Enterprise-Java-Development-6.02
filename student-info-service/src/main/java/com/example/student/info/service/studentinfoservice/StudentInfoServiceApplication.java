package com.example.student.info.service.studentinfoservice;

import com.example.student.info.service.studentinfoservice.Models.Student;
import com.example.student.info.service.studentinfoservice.Repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentInfoServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner run(StudentRepository studentRepository) {
		return args -> {

			studentRepository.save(new Student(1, "Ghada Naser",13));
			studentRepository.save(new Student(2, "Muna Mubarak", 17));
			studentRepository.save(new Student(3, "Essa Said", 10));
			studentRepository.save(new Student(4, "Nader Al Mal", 15));
		};
	}

}
