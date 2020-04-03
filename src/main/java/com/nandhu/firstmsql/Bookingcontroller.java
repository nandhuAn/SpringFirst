package com.nandhu.firstmsql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class Bookingcontroller {
    private BookingRepository bookingRepository;
    @Autowired
    public Bookingcontroller( BookingRepository bookingRepository){
        this.bookingRepository=bookingRepository;
    }
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<HotelBooking> getAll(){
        return bookingRepository.findAll();
    }
    @RequestMapping(value = "/affordable/{price}",method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price){
        return bookingRepository.findByPricePerNightLessThanEqual(price);
    }
    @RequestMapping(value = "/create" ,method = RequestMethod.POST)
    public List<HotelBooking> Create(@RequestBody HotelBooking hotelBooking){
        bookingRepository.save(hotelBooking);
        return bookingRepository.findAll();
    }
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public List<HotelBooking> remove(@PathVariable long id){
        bookingRepository.deleteById(id);
        return bookingRepository.findAll();
    }
    @RequestMapping("https://spring-a.herokuapp.com/")
    public String SayHai(){
        return "hai";
    }

}
