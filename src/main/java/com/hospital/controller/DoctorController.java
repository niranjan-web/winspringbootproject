package com.hospital.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hospital.Entity.DoctorEntity;
import com.hospital.service.DoctorService;

public class DoctorController {

	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/nextpage1")
	public String doctor (@ModelAttribute DoctorEntity doctor, Model model2) 
	{		
		doctorService.adddoctor(doctor);
		model2.addAttribute(doctor);
		return"homepage2";
		
	}

}
