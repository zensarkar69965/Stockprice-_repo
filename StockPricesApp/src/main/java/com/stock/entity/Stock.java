package com.stock.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stocks")
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int stockPrice;
	private String stockName;
	public Stock() {
		super();
	}
	public Stock(int id, int stockPrice, String stockName) {
		super();
		this.id = id;
		this.stockPrice = stockPrice;
		this.stockName = stockName;
	}
	
	public Stock(int stockPrice, String stockName) {
		super();
		this.stockPrice = stockPrice;
		this.stockName = stockName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStockPrice() {
		return stockPrice;
	}
	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	@Override
	public String toString() {
		return "StockEntity [id=" + id + ", stockPrice=" + stockPrice + ", stockName=" + stockName + "]";
	}
	
	
	
	
	
	

}
