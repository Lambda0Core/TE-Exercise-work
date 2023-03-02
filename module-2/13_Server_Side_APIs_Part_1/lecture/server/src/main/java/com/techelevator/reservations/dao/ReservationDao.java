package com.techelevator.reservations.dao;

import java.util.List;
import com.techelevator.reservations.model.Reservation;

public interface ReservationDao {

    List<Reservation> findAll();

    List<Reservation> findByHotel(int hotelId);

    Reservation get(int reservationId);
    //add overloaded methof with hotel id from final lecture

    Reservation create(Reservation reservation, int hotelId);

}
