package com.techelevator.reservations.model;

import org.springframework.beans.factory.annotation.Required;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class Reservation {

    private int id;

    @Min(value=1 , message="The hotelId cannot be empty")
    private int hotelId;
    @NotBlank(message = "fullName is required")
    private String fullName;
    @NotBlank(message="checkInDate is required")
    //@Future(message="checkInDate must be in the future")
    private String checkinDate;
    @NotBlank(message="checkoutDate is required")
    //@Future(message="checkoutDate must be in the future")
    private String checkoutDate;
    @Min( value = 1, message="The minimum number of guest is 1")
    @Max( value = 5, message="The maximum number of guest is 5")
    private int guests;

    public Reservation(int id, int hotelId, String fullName, String checkinDate, String checkoutDate, int guests) {
        this.id = id;
        this.hotelId = hotelId;
        this.fullName = fullName;
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
        this.guests = guests;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        this.guests = guests;
    }

    @Override
    public String toString() {
        return "\n--------------------------------------------" + "\n Reservation Details"
                + "\n--------------------------------------------" + "\n Id: " + id + "\n Hotel Id: " + hotelId
                + "\n Full Name: " + fullName + "\n Checkin Date: " + checkinDate + "\n Checkout Date: " + checkoutDate
                + "\n Guests: " + guests;
    }
}
