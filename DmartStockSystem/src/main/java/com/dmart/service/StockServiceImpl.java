package com.dmart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dmart.globalexception.StockException;
import com.dmart.model.Stock;
import com.dmart.repository.StockRepository;
@Service
public class StockServiceImpl implements StockService{

	@Autowired
	private StockRepository stockRepository;
	@Override
	public Stock addNewStock(Stock stock) {
		return stockRepository.save(stock);
	}

	@Override
	public Stock updateStock(Stock stock) throws StockException {
		Optional<Stock> availStock=stockRepository.findById(stock.getStockId());
		if(availStock.isPresent()) {
			return stockRepository.save(stock);
		} else {
			throw new StockException("No stock is available for given Id");
		}
	}

	@Override
	public Stock deleteStock(Integer stockId) throws StockException {
		Optional<Stock> availStock=stockRepository.findById(stockId);
		if(availStock.isPresent()) {
			 stockRepository.delete(availStock.get());
			 return availStock.get();
		} else {
			throw new StockException("No stock is available for given Id");
		}
	}

	@Override
	public Integer findStockBasedOnLocation(String locationName) throws StockException {
  List<Stock> listOfStock=  stockRepository.findByLocation(locationName);
          
          if(listOfStock.size()==0) {
         	 throw new StockException("Stock does not found");
          } else {
         	 return listOfStock.size();
          }
	}

}
