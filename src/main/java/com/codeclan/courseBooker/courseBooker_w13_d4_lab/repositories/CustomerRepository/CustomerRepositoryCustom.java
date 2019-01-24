package com.codeclan.courseBooker.courseBooker_w13_d4_lab.repositories.CustomerRepository;

import com.codeclan.courseBooker.courseBooker_w13_d4_lab.models.Course;
import com.codeclan.courseBooker.courseBooker_w13_d4_lab.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findCustomersByCourseId(Long Id);

    List<Customer> findCustomersByCustomerTownAndCourseId(String town, Long id);

    List<Customer> findCustomersByCustomerTownAndCourseIdAndOverAge(String town, Long id, int age);


}
