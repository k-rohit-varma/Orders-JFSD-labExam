package com.klef.jfsd.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.exam.model.Orders;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Orders, Integer>{

}
