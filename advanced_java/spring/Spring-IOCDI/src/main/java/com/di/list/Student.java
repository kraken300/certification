package com.di.list;

import java.util.List;

public class Student {
	private String studentName;
	private String studentId;

	private List<String> subjects;

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", subjects=" + subjects + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

}
