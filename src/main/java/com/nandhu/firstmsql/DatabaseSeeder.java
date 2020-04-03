package com.nandhu.firstmsql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private BookingRepository bookingRepository;
    @Autowired
    public DatabaseSeeder(BookingRepository bookingRepository){
        this.bookingRepository=bookingRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        List<HotelBooking> bookings=new ArrayList<>();
        bookings.add(new HotelBooking("nandhu",200.50,3));
        bookings.add(new HotelBooking("Krishna",255.50,5));
        bookingRepository.saveAll(bookings);
    }
}
