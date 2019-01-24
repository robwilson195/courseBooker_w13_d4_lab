package com.codeclan.courseBooker.courseBooker_w13_d4_lab.controllers;


import com.codeclan.courseBooker.courseBooker_w13_d4_lab.models.Course;
import com.codeclan.courseBooker.courseBooker_w13_d4_lab.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/withrating/{rating}")
    public List<Course> findCoursesByRating(@PathVariable int rating) {
        return courseRepository.findCoursesByRating(rating);
    }

    @GetMapping("/bookings/ofcustomer/{Id}")
    public List<Course> findCoursesByCustomerId(@PathVariable Long Id) {
        return courseRepository.findCoursesByCustomerId(Id);
    }

}
