package com.hospital.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.Entity.AdminEntity;


public interface AdminRepository extends JpaRepository<AdminEntity, Integer>
{
	public AdminEntity findByAdminEmailAndAdminPassword(String adminEmail, String adminPassword);
}