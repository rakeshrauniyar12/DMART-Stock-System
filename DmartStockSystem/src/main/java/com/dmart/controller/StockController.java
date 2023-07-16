package com.dmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dmart.globalexception.StockException;
import com.dmart.model.Stock;
import com.dmart.service.StockService;

@RestController	
public class StockController {
   @Autowired
   private StockService stockService;		
   @PostMapping("/addStock")
   public ResponseEntity<Stock> addStock(@RequestBody Stock stock){
	    Stock addStock = stockService.addNewStock(stock);
	    return new ResponseEntity<Stock>(addStock,HttpStatus.ACCEPTED);
   }
   @PutMapping("/updateStock")
   public ResponseEntity<Stock> updateStock(@RequestBody Stock stock) throws StockException{
	    Stock updatedStock = stockService.updateStock(stock);
	    return new ResponseEntity<Stock>(updatedStock,HttpStatus.OK);
   }
   @DeleteMapping("/deleteStock/{stockId}")
   public ResponseEntity<Stock> deleteStock(@PathVariable("stockId") Integer stockId) throws StockException{
	    Stock deleteStock = stockService.deleteStock(stockId);
	    return new ResponseEntity<Stock>(deleteStock,HttpStatus.OK);
   }
   @GetMapping("/findStock/{locationName}")
   public ResponseEntity<Integer> findStockBasedOnLocation(@PathVariable("locationName") String locationName) throws StockException{
	    Integer numberOfStock = stockService.findStockBasedOnLocation(locationName);
	    return new ResponseEntity<Integer>(numberOfStock,HttpStatus.OK);
   }
}
