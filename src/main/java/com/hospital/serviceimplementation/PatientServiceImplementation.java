package com.hospital.serviceimplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.Entity.PatientEntity;
import com.hospital.repository.PatientRepository;
import com.hospital.service.PatientService;


@Service
public class PatientServiceImplementation implements PatientService
{
	@Autowired
    private  PatientRepository patientRepository; 

	@Override
	public void addpatient(PatientEntity patient) {
		patientRepository.save(patient);
		
	}
}