package com.telusko.secure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.secure.entity.CurrencyExchangeRate;
import com.telusko.secure.repo.ExchangeCurrencyRepository;

@RestController
public class CurrencyExchangeController {
	@Autowired
	ExchangeCurrencyRepository exchangeCurrencyRepository;
	@Autowired
	Environment enviornment;
	

	@GetMapping("/currency-service/from/{from}/to/{to}")
	public CurrencyExchangeRate getCurrencyExchangeRate(@PathVariable String from, @PathVariable String to) {
		CurrencyExchangeRate currencyExchangeRate=new CurrencyExchangeRate (1001, from, to, Long.valueOf(83));
		exchangeCurrencyRepository.findByFromAndTo(from, to);
		currencyExchangeRate.setPort(Integer.parseInt(enviornment.getProperty("local.server.port")));
return currencyExchangeRate;
	}
	

}
