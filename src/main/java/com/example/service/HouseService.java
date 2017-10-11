package com.example.service;

import com.example.model.House;
import com.example.model.User;

public interface HouseService {
	
	public House findHouseByAddress(String address);
	public House findHouseByUser(User user);
	public void saveHouse(House house);
	public void deleteHouse(House house);
	
}
