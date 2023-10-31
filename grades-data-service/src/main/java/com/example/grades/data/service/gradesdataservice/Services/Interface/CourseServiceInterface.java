package com.example.grades.data.service.gradesdataservice.Services.Interface;

import com.example.grades.data.service.gradesdataservice.DTO.CourseGrade;

public interface CourseServiceInterface {
    CourseGrade getGradesByCourseCode(Integer courseCode);

    // CourseGrade getCourseByCourseCode(Integer Course_Code);
}
