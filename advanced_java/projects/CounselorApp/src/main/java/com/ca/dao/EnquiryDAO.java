package com.ca.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ca.entity.Enquiry;
import com.ca.repository.EnquiryRepository;

@Repository
public class EnquiryDAO {

	@Autowired
	private EnquiryRepository enquiryRepository;

	public Optional<Enquiry> findByPhone(Long phone) {
		return enquiryRepository.findByPhone(phone);
	}

	public Enquiry save(Enquiry enquiry) {
		return enquiryRepository.save(enquiry);
	}
}
