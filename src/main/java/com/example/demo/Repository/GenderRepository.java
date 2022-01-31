package com.example.demo.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.Entities.Genders;

@Repository
public interface GenderRepository extends JpaRepository<Genders, Serializable>{
   
	/*
	 * @Query("select gname from Genders") public List<String> getGender();
	 */
	
}
