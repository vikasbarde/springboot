package com.example.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.City;
import com.example.service.CityService;

@RestController
public class DemoController {
	@Autowired
	private CityService cityService;
	@GetMapping("/user")
	public String getUserDetails() {
		return "Your User id is "+UUID.randomUUID().toString();
	}
	@GetMapping("/city")
	public List<City> getAllCities(){
		return cityService.getAllCities();
	}
}
