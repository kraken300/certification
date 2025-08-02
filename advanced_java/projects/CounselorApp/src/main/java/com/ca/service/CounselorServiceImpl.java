package com.ca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ca.dao.CounselorDAO;
import com.ca.dto.CounselorDTO;
import com.ca.dto.LoginDTO;
import com.ca.rs.ResponseStructure;

@Service
public class CounselorServiceImpl implements CounselorService {

	@Autowired
	private CounselorDAO counselorDAO;

	@Override
	public ResponseEntity<?> registerCounselor(CounselorDTO counselorDTO) {
		boolean isPresent = counselorDAO.findByEmail(counselorDTO.getEmail());

		if (isPresent) {
			return new ResponseEntity<String>("Already registered!", HttpStatus.BAD_REQUEST);
		} else {
			counselorDAO.save(counselorDTO);

			ResponseStructure<String> rs = new ResponseStructure<String>("Registered successfully with email",
					counselorDTO.getEmail(), HttpStatus.CREATED);

			return new ResponseEntity<ResponseStructure<String>>(rs, HttpStatus.OK);
		}
	}

	@Override
	public ResponseEntity<String> loginCounselor(LoginDTO loginDTO) {
		boolean isLogin = counselorDAO.findByEmailAndPassword(loginDTO.getEmail(), loginDTO.getPassword());

		if (isLogin) {
			return new ResponseEntity<String>("Logged in successfully!", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Invalid credentials!", HttpStatus.BAD_REQUEST);
		}

	}

}
