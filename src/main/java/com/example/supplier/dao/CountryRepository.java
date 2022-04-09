package com.example.supplier.dao;


import org.springframework.data.repository.CrudRepository;

import com.example.supplier.model.Country;

public interface CountryRepository extends CrudRepository<Country, Integer> {
}