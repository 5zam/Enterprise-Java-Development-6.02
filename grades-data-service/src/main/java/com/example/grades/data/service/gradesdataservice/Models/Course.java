package com.example.grades.data.service.gradesdataservice.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public class Course {
    //Course attributes:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseCode;
    private String courseName;

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(
//            name = "Course_Grade",
//            joinColumns = { @JoinColumn(name = "Course_Code")},
//            inverseJoinColumns = { @JoinColumn(name = "grade_id")}
//    )

    @OneToMany(mappedBy = "course")
    private List<Grade> grades;

//    private List<Course> courses;
//    private List<Grade> grades;
}

