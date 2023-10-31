package com.example.grades.data.service.gradesdataservice.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer grade;
    private Integer Student_id;

//    @ManyToOne
//    @JoinColumn(name = "student_id")
//    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_code")
    private Course course;
}

