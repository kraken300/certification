package com.ss.controller;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ss.dto.UserLoginDTO;
import com.ss.dto.UserRegisterDTO;
import com.ss.entity.User;
import com.ss.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody UserRegisterDTO registerDTO) {
		Optional<User> opt = userRepository.findByUsername(registerDTO.getUsername());

		if (opt.isPresent()) {
			return ResponseEntity.badRequest().body("Already registered!");
		}

		registerDTO.setPassword(passwordEncoder.encode(registerDTO.getPassword()));
		User user = new User();
		BeanUtils.copyProperties(registerDTO, user);
		User saved = userRepository.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body("User registered with username : " + saved.getUsername());
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody UserLoginDTO loginDTO) {
		UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(loginDTO.getUsername(),
				loginDTO.getPassword());

		Authentication authenticate = authenticationManager.authenticate(authToken);

		if (authenticate.isAuthenticated()) {
			return ResponseEntity.ok("Logged in successfully!");
		}

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("INVALID CREDENTIALS");
	}

	@GetMapping("/admin")
	public String admin() {
		return "Admin page";
	}

	@GetMapping("/user")
	public String user() {
		return "User page";
	}

}
