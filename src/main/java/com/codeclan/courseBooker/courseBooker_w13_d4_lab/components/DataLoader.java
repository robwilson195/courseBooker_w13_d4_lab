package com.codeclan.courseBooker.courseBooker_w13_d4_lab.components;

import com.codeclan.courseBooker.courseBooker_w13_d4_lab.models.Booking;
import com.codeclan.courseBooker.courseBooker_w13_d4_lab.models.Course;
import com.codeclan.courseBooker.courseBooker_w13_d4_lab.models.Customer;
import com.codeclan.courseBooker.courseBooker_w13_d4_lab.repositories.BookingRepository.BookingRepository;
import com.codeclan.courseBooker.courseBooker_w13_d4_lab.repositories.CourseRepository.CourseRepository;
import com.codeclan.courseBooker.courseBooker_w13_d4_lab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner{

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Steve", "Stow", 22);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Jannet", "Berwick", 40);
        customerRepository.save(customer2);

        Course course1 = new Course("German", "Stow", 3);
        courseRepository.save(course1);
        Course course2 = new Course("Art History", "Edinburgh", 3);
        courseRepository.save(course2);

        Booking booking1 = new Booking("25-12-19", course2, customer2);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("14-02-19", course1, customer1);
        bookingRepository.save(booking2);

    }

}
