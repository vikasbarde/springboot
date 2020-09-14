package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CityDao;
import com.example.model.City;
@Service
public class CityService {
	@Autowired
	private CityDao cityDao;
	
	public List<City> getAllCities(){
		return cityDao.getAllCities();
	}
	
}
