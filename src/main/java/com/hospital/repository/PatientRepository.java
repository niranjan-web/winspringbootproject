package com.hospital.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.Entity.PatientEntity;


public interface PatientRepository extends JpaRepository<PatientEntity, Integer>
{

}
