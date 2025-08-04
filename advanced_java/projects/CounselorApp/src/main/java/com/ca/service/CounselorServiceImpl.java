package com.ca.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ca.dao.CounselorDAO;
import com.ca.dto.CounselorDTO;
import com.ca.dto.CounselorResponseDTO;
import com.ca.dto.LoginDTO;
import com.ca.entity.Counselor;
import com.ca.entity.Enquiry;
import com.ca.exception.CounselorNotFound;
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

			Counselor counselor = new Counselor();

			BeanUtils.copyProperties(counselorDTO, counselor);

			counselorDAO.save(counselor);

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

	@Override
	public ResponseEntity<ResponseStructure<CounselorResponseDTO>> updateCounselor(Integer cid,
			CounselorDTO counselorDTO) {
		Counselor counselor = counselorDAO.findById(cid)
				.orElseThrow(() -> new CounselorNotFound("Counselor not found!"));

		if (counselorDTO.getEmail() != null) {
			counselor.setEmail(counselorDTO.getEmail());
		}

		if (counselorDTO.getName() != null) {
			counselor.setName(counselorDTO.getName());
		}

		if (counselorDTO.getPhone() != null) {
			counselor.setPhone(counselorDTO.getPhone());
		}

		Counselor updatedCounselor = counselorDAO.save(counselor);

		CounselorResponseDTO counselorResponseDTO = new CounselorResponseDTO();

		BeanUtils.copyProperties(updatedCounselor, counselorResponseDTO);

		ResponseStructure<CounselorResponseDTO> rs = new ResponseStructure<CounselorResponseDTO>(
				"Updated successfully!", counselorResponseDTO, HttpStatus.OK);

		return new ResponseEntity<ResponseStructure<CounselorResponseDTO>>(rs, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<String> deleteCounselorById(Integer cid) {
		Counselor counselor = counselorDAO.findById(cid)
				.orElseThrow(() -> new CounselorNotFound("Counselor not found!"));

		counselorDAO.delete(counselor);
		return new ResponseEntity<String>("Deleted successfully!", HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<?>> getEnquiries(Integer cid) {
		Counselor counselor = counselorDAO.findById(cid)
				.orElseThrow(() -> new CounselorNotFound("Counselor not found!"));

		ResponseStructure<List<Enquiry>> rs = new ResponseStructure<>("Enquiries retrieved successfully!",
				counselor.getEnquiries(), HttpStatus.OK);

		return new ResponseEntity<ResponseStructure<?>>(rs, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<CounselorResponseDTO>> getCounselorById(Integer cid) {
		Counselor counselor = counselorDAO.findById(cid)
				.orElseThrow(() -> new CounselorNotFound("Counselor not found!"));

		CounselorResponseDTO counselorResponseDTO = new CounselorResponseDTO();

		BeanUtils.copyProperties(counselor, counselorResponseDTO);

		ResponseStructure<CounselorResponseDTO> rs = new ResponseStructure<CounselorResponseDTO>(
				"Counselor fetched successfully!", counselorResponseDTO, HttpStatus.OK);
		
		return new ResponseEntity<ResponseStructure<CounselorResponseDTO>>(rs, HttpStatus.OK);
	}

}
