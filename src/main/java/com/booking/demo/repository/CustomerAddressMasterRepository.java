package com.booking.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.demo.entity.CustomerAddressMaster;

@Repository
public interface CustomerAddressMasterRepository extends JpaRepository<CustomerAddressMaster, Integer> {

}
