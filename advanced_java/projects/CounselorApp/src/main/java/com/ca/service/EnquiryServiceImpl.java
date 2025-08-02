package com.ca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ca.dao.EnquiryDAO;

@Service
public class EnquiryServiceImpl implements EnquiryService{
	
	@Autowired
	private EnquiryDAO enquiryDAO;
	
}
