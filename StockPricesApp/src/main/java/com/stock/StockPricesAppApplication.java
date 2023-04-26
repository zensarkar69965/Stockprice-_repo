package com.stock;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableScheduling
@EnableWebSocket
public class StockPricesAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockPricesAppApplication.class, args);
	}
	

}
