package com.sb.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
//@EqualsAndHashCode
@Data
@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sid;

	private String name;

	@Column(unique = true, nullable = false)
	@Email(message = "Invalid email")
	private String email;

	@Column(unique = true)
	private Long phone;

	@NotEmpty
	private String std;

	@NotBlank
	private String division;

	@Size(min = 4, max = 10, message = "Password must be between 4-10 letters")
	private String password;

	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate cratedDate;

	@UpdateTimestamp
	private LocalDate updatedDate;
}