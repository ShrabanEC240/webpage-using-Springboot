package com.example.demo.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entities.Timing;

public interface TimeRepository extends JpaRepository<Timing, Serializable>{
	
	@Query("select tname from Timing")
	public List<String> getTimes();

}
