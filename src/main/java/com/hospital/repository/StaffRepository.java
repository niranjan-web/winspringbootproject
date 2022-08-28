package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.Entity.StaffEntity;


public interface StaffRepository extends JpaRepository<StaffEntity, Integer>
{

}
