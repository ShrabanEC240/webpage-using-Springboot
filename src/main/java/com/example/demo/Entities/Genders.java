package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "genders")
public class Genders {
	
	@Id
	@Column(name = "gid")
	private int gid;
	
	@Column(name = "gname")
	private String gname;

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

	@Override
	public String toString() {
		return "Genders [gid=" + gid + ", gname=" + gname + "]";
	}
	
	

}
