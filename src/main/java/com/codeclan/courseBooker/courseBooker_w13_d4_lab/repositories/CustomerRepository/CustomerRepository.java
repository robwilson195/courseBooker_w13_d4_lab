package com.codeclan.courseBooker.courseBooker_w13_d4_lab.repositories.CustomerRepository;

import com.codeclan.courseBooker.courseBooker_w13_d4_lab.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CustomerRepositoryCustom, JpaRepository<Customer, Long> {
}
