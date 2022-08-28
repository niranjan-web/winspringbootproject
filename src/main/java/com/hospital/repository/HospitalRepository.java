package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.Entity.HospitalEntity;

public interface HospitalRepository extends JpaRepository<HospitalEntity, Integer>
{

}
