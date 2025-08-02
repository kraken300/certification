package com.ca.dao;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ca.dto.CounselorDTO;
import com.ca.entity.Counselor;
import com.ca.repository.CounselorRepository;

@Repository
public class CounselorDAO {

	@Autowired
	private CounselorRepository counselorRepository;

	public boolean findByEmail(String email) {
		return counselorRepository.findByEmail(email).isPresent();
	}

	public void save(CounselorDTO counselorDTO) {

		Counselor counselor = new Counselor();

		BeanUtils.copyProperties(counselorDTO, counselor);

		counselorRepository.save(counselor);

	}

	public boolean findByEmailAndPassword(String email, String password) {

		return counselorRepository.findByEmailAndPassword(email, password).isPresent();
	}

}
