package com.hospital.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.Entity.DoctorEntity;


public interface DoctorRepository extends JpaRepository<DoctorEntity, Integer>
{

}
