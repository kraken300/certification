package com.sb.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDTO {
	private String name;

	@Email(message = "Invalid email")
	private String email;

	private Long phone;

	@NotEmpty
	private String std;

	@NotBlank
	private String division;

	@Size(min = 4, max = 10, message = "Password must be between 4-10 letters")
	private String password;

}
