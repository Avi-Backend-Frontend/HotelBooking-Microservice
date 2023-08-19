package com.booking.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.booking.demo.entity.DepositeMaster;

@Repository
public interface DepositeMasterRepository extends JpaRepository<DepositeMaster, Integer> {

}
