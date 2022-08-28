package com.hospital.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hospital.Entity.PatientEntity;
import com.hospital.service.PatientService;

@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@PostMapping("/next")
	public String next (@ModelAttribute PatientEntity patient, Model model) 
	{
		 
		patientService.addpatient(patient);
		model.addAttribute(patient);

		return"homepage2";
		
	}
}
