package com.hospital.service;

import com.hospital.Entity.AdminEntity;

public interface AdminService 
{
     public AdminEntity  findByAdminEmailAndAdminPassword(String adminEmail, String adminPassword);
	
}
