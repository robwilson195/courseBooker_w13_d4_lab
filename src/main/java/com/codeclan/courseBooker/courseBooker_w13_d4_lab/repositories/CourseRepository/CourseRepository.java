package com.codeclan.courseBooker.courseBooker_w13_d4_lab.repositories.CourseRepository;

import com.codeclan.courseBooker.courseBooker_w13_d4_lab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CourseRepositoryCustom, JpaRepository<Course, Long> {

}
