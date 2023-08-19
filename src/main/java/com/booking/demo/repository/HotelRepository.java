package com.booking.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.demo.entity.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Integer> {

}
