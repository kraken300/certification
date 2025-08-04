package com.ca.service;

import org.springframework.http.ResponseEntity;

import com.ca.dto.CounselorDTO;
import com.ca.dto.CounselorResponseDTO;
import com.ca.dto.LoginDTO;
import com.ca.rs.ResponseStructure;

public interface CounselorService {

	ResponseEntity<?> registerCounselor(CounselorDTO counselorDTO);

	ResponseEntity<String> loginCounselor(LoginDTO loginDTO);

	ResponseEntity<ResponseStructure<CounselorResponseDTO>> updateCounselor(Integer cid, CounselorDTO counselorDTO);

	ResponseEntity<String> deleteCounselorById(Integer cid);

	ResponseEntity<ResponseStructure<?>> getEnquiries(Integer cid);
	
	ResponseEntity<ResponseStructure<CounselorResponseDTO>> getCounselorById(Integer cid);
}
