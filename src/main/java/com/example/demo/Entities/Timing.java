package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "timing2")
public class Timing {
    
	@Id
	@Column(name = "tid")
	private int tid;
	
	@Column(name = "tname")
	private String tname;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Timing [tid=" + tid + ", tname=" + tname + "]";
	}
	
	
}
