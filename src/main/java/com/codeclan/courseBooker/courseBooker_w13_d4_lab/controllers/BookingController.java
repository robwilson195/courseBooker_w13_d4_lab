package com.codeclan.courseBooker.courseBooker_w13_d4_lab.controllers;

import com.codeclan.courseBooker.courseBooker_w13_d4_lab.models.Booking;
import com.codeclan.courseBooker.courseBooker_w13_d4_lab.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping("/ondate/{date}")
    public List<Booking> findBookingsByDate(@PathVariable String date) {
        return bookingRepository.findBookingsByDate(date);
    }

}
