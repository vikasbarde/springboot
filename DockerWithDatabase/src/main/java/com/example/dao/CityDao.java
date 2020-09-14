package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import com.example.model.City;

@Repository
public class CityDao {
	@Autowired
	private Environment env;
	private List<City> cities = new ArrayList<City>();
	private Connection connection;
	private Statement statement;
	private ResultSet rs;

	public List<City> getAllCities() {
		try {
			Class.forName(env.getProperty("spring.datasource.driver-class-name"));
			connection = DriverManager.getConnection(env.getProperty("spring.datasource.url"),
					env.getProperty("spring.datasource.username"), env.getProperty("spring.datasource.password"));
			statement = connection.createStatement();
			rs = statement.executeQuery("SELECT * FROM country.city");
			while (rs.next()) {
				City city = new City();
				city.setCityName(rs.getString(1));
				cities.add(city);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return cities;
	}

}
