package com.example.demo.Entities;

import java.util.Arrays;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

@Entity
@Table(name = "stud211")
public class StudentEntity {
    
	@Id
	@GeneratedValue
	private int studentId;
	private String name;
	private String email;
	private Long phno;
	private String gender;
	private String course;
	@OrderColumn
	@ElementCollection
	@CollectionTable(name = "STUDENT_COURSE_TIMINGS", joinColumns = @JoinColumn(name = "studentId"))
	private String[] timings;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String[] getTimings() {
		return timings;
	}
	public void setTimings(String[] timings) {
		this.timings = timings;
	}
	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", name=" + name + ", email=" + email + ", phno=" + phno
				+ ", gender=" + gender + ", course=" + course + ", timings=" + Arrays.toString(timings) + "]";
	}
	
	
}
