package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.House;
import com.example.model.User;
import com.example.repository.HouseRepository;
import com.example.repository.UserRepository;

@Service("houseService")
public class HouseServiceImpl implements HouseService{

	@Autowired
	private UserRepository userRepository;
	@Autowired
    private HouseRepository houseRepository;
	
	@Override
	public void saveHouse(House house) {
		houseRepository.save(house);
	}
	
	@Override
	public House findHouseByAddress(String address) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public House findHouseByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteHouse(House house) {
		// TODO Auto-generated method stub
		
	}


}
