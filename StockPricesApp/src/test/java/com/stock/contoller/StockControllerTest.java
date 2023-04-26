package com.stock.contoller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.stock.entity.Stock;
import com.stock.service.StockService;


public class StockControllerTest {
	
	@Autowired
	MockMvc mockMvc;

	@Autowired
	ObjectMapper objectMapper;

	@MockBean
	StockService stockService;
	
	@Test
	public void testGetAllStocks() throws Exception {
		Stock stock1 = new Stock();
		Stock stock2 = new Stock();
		List<Stock> stocks = Arrays.asList(stock1, stock2);

		when(stockService.getAllStocks()).thenReturn(stocks);

		String valueAsString = objectMapper.writeValueAsString(stocks);
		int length = valueAsString.length();

		when(stockService.getAllStocks()).thenReturn(stocks);

		MvcResult mvcResult = this.mockMvc.perform(get("http://localhost:7010")).andExpect(status().isOk())
				.andReturn();

		assertEquals(length, mvcResult.getResponse().getContentAsString().length());

	}

}
