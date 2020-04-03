package com.nandhu.firstmsql;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelBooking{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private  long id;
    private String hotelName;
    private double pricePerNight;
    private int nbOfNights;

    public HotelBooking(){}
    public HotelBooking(String hotelName,double pricePerNight,int nbOfNights){
        this.hotelName=hotelName;
        this.nbOfNights=nbOfNights;
        this.pricePerNight=pricePerNight;

    }

    public int getNbOfNights() {
        return nbOfNights;
    }

    public void setNbOfNights(int nbOfNights) {
        this.nbOfNights = nbOfNights;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public  double getTotalPrice(){
        return pricePerNight*nbOfNights;
    }

    public long getId() {
        return id;
    }
}

