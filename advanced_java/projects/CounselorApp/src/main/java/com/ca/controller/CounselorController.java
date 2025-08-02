package com.ca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ca.dto.CounselorDTO;
import com.ca.dto.LoginDTO;
import com.ca.service.CounselorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/counselor")
public class CounselorController {

	@Autowired
	private CounselorService counselorService;

	@PostMapping
	public ResponseEntity<?> registerCounselor(@RequestBody @Valid CounselorDTO counselorDTO) {
		return counselorService.registerCounselor(counselorDTO);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginCounselor(@RequestBody LoginDTO loginDTO){
		return counselorService.loginCounselor(loginDTO);
	}

}
