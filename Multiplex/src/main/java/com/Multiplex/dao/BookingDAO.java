package com.Multiplex.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Multiplex.entities.Booking;
public interface BookingDAO extends JpaRepository<Booking,Integer>{

}