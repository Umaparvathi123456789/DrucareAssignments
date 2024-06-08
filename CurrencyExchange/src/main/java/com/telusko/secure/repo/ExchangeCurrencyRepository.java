package com.telusko.secure.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.secure.entity.CurrencyExchangeRate;

public interface ExchangeCurrencyRepository extends JpaRepository<CurrencyExchangeRate, Integer>{
	CurrencyExchangeRate findByFromAndTo(String from, String to);

}
