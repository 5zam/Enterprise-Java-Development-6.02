package com.example.grades.data.service.gradesdataservice.Controllers;

import com.example.grades.data.service.gradesdataservice.Models.Course;
import com.example.grades.data.service.gradesdataservice.Models.Grade;
import com.example.grades.data.service.gradesdataservice.Repositories.GradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class GradeController {

    @Autowired
    private GradeRepository gradeRepository;

    //get all grades
    @GetMapping("/grades")
    @ResponseStatus(HttpStatus.OK)
    public List<Grade> getGrades(@RequestParam Optional<Long> id) {
        if (id.isPresent()) {
            return gradeRepository.findAll(id.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Wrong id")));
        }
        return gradeRepository.findAll();
    }
}
