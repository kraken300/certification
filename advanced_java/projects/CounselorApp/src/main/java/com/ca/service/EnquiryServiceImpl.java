package com.ca.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ca.dao.CounselorDAO;
import com.ca.dao.EnquiryDAO;
import com.ca.dto.EnquiryRequestDTO;
import com.ca.entity.Counselor;
import com.ca.entity.Enquiry;
import com.ca.exception.CounselorNotFound;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Autowired
	private CounselorDAO counselorDAO;

	@Autowired
	private EnquiryDAO enquiryDAO;

	@Override
	public ResponseEntity<String> addEnquiry(Integer cid, EnquiryRequestDTO enquiryRequestDTO) {
		Counselor counselor = counselorDAO.findById(cid)
				.orElseThrow(() -> new CounselorNotFound("Counselor not found!"));

		Optional<Enquiry> enquiryPresent = enquiryDAO.findByPhone(enquiryRequestDTO.getPhone());

		if (enquiryPresent.isPresent()) {
			return new ResponseEntity<String>(
					"Enquiry is already taken by the Counselor : " + enquiryPresent.get().getCounselor().getName(),
					HttpStatus.OK);
		} else {
			Enquiry enquiry = new Enquiry();
			BeanUtils.copyProperties(enquiryRequestDTO, enquiry);
			enquiry.setCounselor(counselor);
			enquiryDAO.save(enquiry);
			return new ResponseEntity<String>("Enquiry added successfully!", HttpStatus.CREATED);
		}
	}

}
