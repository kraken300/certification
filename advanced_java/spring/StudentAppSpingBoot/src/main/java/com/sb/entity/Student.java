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

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
//@EqualsAndHashCode
//@Data
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

	public Student() {

	}

	public Student(Long sid, String name, @Email(message = "Invalid email") String email, Long phone,
			@NotEmpty String std, @NotBlank String division,
			@Size(min = 4, max = 10, message = "Password must be between 4-10 letters") String password,
			LocalDate cratedDate, LocalDate updatedDate) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.std = std;
		this.division = division;
		this.password = password;
	}

	public Long getSid() {
		return sid;
	}

	public void setSid(Long sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getCratedDate() {
		return cratedDate;
	}

	public void setCratedDate(LocalDate cratedDate) {
		this.cratedDate = cratedDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

}