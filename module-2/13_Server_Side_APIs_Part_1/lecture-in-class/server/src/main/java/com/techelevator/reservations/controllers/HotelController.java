package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDao.get(id);
    }

    @RequestMapping(path="/hotels/filter", method = RequestMethod.GET)
    public List<Hotel> searchHotels(@RequestParam(required=false) String c, @RequestParam String s){
        return hotelDao.getFilteredList(s,c);
    }

    //get reservations for 1 hotel
    @RequestMapping(path="/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservationsByHotel(@PathVariable Integer id){
        return reservationDao.findByHotel(id);
    }

    //get specific reservation by hotel
    @RequestMapping(path="/hotels/{id}/reservations/{res_id}", method = RequestMethod.GET)
    public Reservation listReservationsByHotel(@PathVariable Integer id, @PathVariable Integer res_id){
        return reservationDao.get(id,res_id);
    }
    // *******  RESERVATIONS **************
    @RequestMapping(path="/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations(){
        return reservationDao.findAll();
    }

    @RequestMapping(path="/reservations/{id}", method = RequestMethod.GET)
    public Reservation listReservations(@PathVariable Integer id){
        return reservationDao.get(id);
    }

    @RequestMapping(path="/reservations",method = RequestMethod.POST)
    public Reservation saveReservation(@RequestBody Reservation reservation){
            return reservationDao.create(reservation, reservation.getHotelId());
    }

    @RequestMapping(path="/reservations",method = RequestMethod.PUT)
    public Reservation updateReservation(@RequestBody Reservation reservation){
        return reservationDao.create(reservation, reservation.getHotelId());
    }
}
