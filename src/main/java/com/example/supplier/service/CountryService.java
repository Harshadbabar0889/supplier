package com.example.supplier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supplier.dao.CountryRepository;

@Service
public class CountryService {

	
	@Autowired
	CountryRepository countryRepository;
	
	public Object getRecords()
	{
		return countryRepository.findAll();
	}
}
