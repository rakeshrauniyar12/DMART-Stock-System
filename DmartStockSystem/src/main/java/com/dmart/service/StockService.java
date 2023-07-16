package com.dmart.service;

import org.springframework.stereotype.Service;

import com.dmart.globalexception.StockException;
import com.dmart.model.Stock;
@Service
public interface StockService {
   public Stock addNewStock(Stock stock);
   public Stock updateStock(Stock stock) throws StockException;
   public Stock deleteStock(Integer stockId) throws StockException;
   public Integer findStockBasedOnLocation(String locationName) throws StockException;
   
}
