package com.example.supplier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.supplier.service.CountryService;

@RestController
public class CountryController {

	@Autowired
	CountryService service;
	
	@PostMapping("/getCountries")
	public Object getCountries() {
		return service.getRecords();
	}
}
