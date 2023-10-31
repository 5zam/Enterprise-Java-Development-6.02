package com.example.student.info.service.studentinfoservice.Controllers;


import com.example.student.info.service.studentinfoservice.Models.Student;
import com.example.student.info.service.studentinfoservice.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students/{Student_id}")
    @ResponseStatus(HttpStatus.OK)
    public Student getStudentInfo(@PathVariable Integer Student_id) {
        return studentRepository.findById(Student_id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Sorry, Student not found!"));
    }

}
