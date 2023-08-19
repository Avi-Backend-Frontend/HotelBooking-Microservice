package com.booking.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.demo.entity.HotelAddressMaster;

@Repository
public interface HotelAddressMasterRepository extends JpaRepository<HotelAddressMaster, Integer> {

}
