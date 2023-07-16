package com.dmart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dmart.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer>{
    public List<Stock> findByLocation(String location);
}
