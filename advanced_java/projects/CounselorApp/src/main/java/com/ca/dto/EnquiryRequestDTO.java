package com.ca.dto;

import com.ca.enums.ClassMode;
import com.ca.enums.Course;
import com.ca.enums.Status;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnquiryRequestDTO {

	private String name;

	private Long phone;

	@Email(message = "Invalid email")
	private String email;

	@NotNull(message = "ClassMode should not be null")
	private ClassMode classMode = ClassMode.OFFLINE;

	@NotNull(message = "Status should not be null")
	private Status status = Status.ACTIVE;

	@NotNull(message = "Course should not be null")
	private Course course;
}
