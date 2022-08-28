package com.hospital.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.Entity.AdminEntity;
import com.hospital.repository.AdminRepository;
import com.hospital.service.AdminService;

@Service
public class AdminServiceImplementation implements AdminService
{
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public AdminEntity findByAdminEmailAndAdminPassword(String adminEmail, String adminPassword) {
		
		 AdminEntity adminEntity=  adminRepository.findByAdminEmailAndAdminPassword(adminEmail, 
				 adminPassword);
		return adminEntity;
	}


}
