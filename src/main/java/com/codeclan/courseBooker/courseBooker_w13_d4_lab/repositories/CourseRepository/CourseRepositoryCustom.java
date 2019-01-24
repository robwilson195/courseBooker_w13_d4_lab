package com.codeclan.courseBooker.courseBooker_w13_d4_lab.repositories.CourseRepository;

import com.codeclan.courseBooker.courseBooker_w13_d4_lab.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findCoursesByCustomerId(Long Id);
}
