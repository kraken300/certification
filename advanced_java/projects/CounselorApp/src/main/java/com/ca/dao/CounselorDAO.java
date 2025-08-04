package com.ca.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ca.entity.Counselor;
import com.ca.repository.CounselorRepository;

@Repository
public class CounselorDAO {

	@Autowired
	private CounselorRepository counselorRepository;

	public boolean findByEmail(String email) {
		return counselorRepository.findByEmail(email).isPresent();
	}

	public Counselor save(Counselor counselor) {
		return counselorRepository.save(counselor);
	}

	public boolean findByEmailAndPassword(String email, String password) {
		return counselorRepository.findByEmailAndPassword(email, password).isPresent();
	}

	public Optional<Counselor> findById(Integer cid) {
		return counselorRepository.findById(cid);
	}

	public void delete(Counselor counselor) {
		counselorRepository.delete(counselor);
	}

}
