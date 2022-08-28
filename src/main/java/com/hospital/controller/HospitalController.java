package com.hospital.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HospitalController 
{
		@GetMapping("/login")
		private String login() {
			return"login";
		}
	
		@GetMapping("/homepage1")
		private String home() {
			return"homepage1";
		}
		
		@GetMapping("/doctor")
		private String doctor() {
			return"doctor";
		}
		
		@GetMapping("/dashboard")
		private String dashboard()
		{
			return"dashboard";
		}
		
		@GetMapping("/admin")
		private String admin(){
			return"admin";
		}
		@GetMapping("/staff")
		private String staff() {
			return"staff";
		}
		
		@GetMapping("/homepage2")
		private String home2() {
			return"homepage2";
		}

		@GetMapping("/patient")
		private String patient()
		{
			return"patient";
		}
		
		@GetMapping("/firstpage")
		private String firstpage()
		{
			return"firstpage";
		}	

}
