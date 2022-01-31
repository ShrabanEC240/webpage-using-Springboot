package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course_details1")
public class Course {
	
	@Id
	@Column(name = "cid")
	private int cid;
	
	@Column(name = "coursename")
	private String coursename;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", coursename=" + coursename + "]";
	}
	
   
}
