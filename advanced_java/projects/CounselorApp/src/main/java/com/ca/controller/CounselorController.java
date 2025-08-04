package com.ca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ca.dto.CounselorDTO;
import com.ca.dto.CounselorResponseDTO;
import com.ca.dto.LoginDTO;
import com.ca.rs.ResponseStructure;
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
	public ResponseEntity<String> loginCounselor(@RequestBody LoginDTO loginDTO) {
		return counselorService.loginCounselor(loginDTO);
	}

	@PutMapping("/{cid}")
	public ResponseEntity<ResponseStructure<CounselorResponseDTO>> updateCounselor(@PathVariable Integer cid,
			@RequestBody CounselorDTO counselorDTO) {
		return counselorService.updateCounselor(cid, counselorDTO);
	}

	@DeleteMapping("/{cid}")
	public ResponseEntity<String> deleteCounselor(@PathVariable Integer cid) {
		return counselorService.deleteCounselorById(cid);
	}

	@GetMapping("/{cid}")
	public ResponseEntity<ResponseStructure<?>> getEnquiriesByCid(@PathVariable Integer cid) {
		return counselorService.getEnquiries(cid);
	}

	@GetMapping("/get/{cid}")
	public ResponseEntity<ResponseStructure<CounselorResponseDTO>> getCounselorById(@PathVariable Integer cid) {
		return counselorService.getCounselorById(cid);
	}
}
