package com.codeclan.courseBooker.courseBooker_w13_d4_lab.repositories.BookingRepository;

import com.codeclan.courseBooker.courseBooker_w13_d4_lab.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends BookingRepositoryCustom, JpaRepository<Booking, Long> {

    List<Booking> findBookingsByDate(String date);
}
