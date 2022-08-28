package com.hospital.serviceimplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.Entity.StaffEntity;
import com.hospital.repository.StaffRepository;
import com.hospital.service.StaffService;


@Service
public class StaffServiceImplementation implements StaffService
{
	@Autowired
    private  StaffRepository staffRepository; 

	@Override
	public void addstaff(StaffEntity staff) {
		staffRepository.save(staff);
		
	}
}
