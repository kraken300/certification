package com.ca.service;

import org.springframework.http.ResponseEntity;

import com.ca.dto.EnquiryRequestDTO;

public interface EnquiryService {

	ResponseEntity<String> addEnquiry(Integer cid, EnquiryRequestDTO enquiryRequestDTO);

}
