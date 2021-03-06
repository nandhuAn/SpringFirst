package com.nandhu.firstmsql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository  extends JpaRepository<HotelBooking,Long> {
    List<HotelBooking> findByPricePerNightLessThanEqual(Double price);
}