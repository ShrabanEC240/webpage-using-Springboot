package com.example.demo.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Entities.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable>{
	
	@Query("select coursename from Course")
	public List<String> getCourse();

}
