package com.hospital.serviceimplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.Entity.DoctorEntity;
import com.hospital.repository.DoctorRepository;
import com.hospital.service.DoctorService;


@Service
public class DoctorServiceImplementation implements DoctorService
{
	@Autowired
    private  DoctorRepository doctorRepository; 

	@Override
	public void adddoctor(DoctorEntity doctor) {
		doctorRepository.save(doctor);
		
	}
}