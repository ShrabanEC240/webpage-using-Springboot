package com.example.demo.Service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Genders;
import com.example.demo.Repository.CourseRepository;
import com.example.demo.Repository.GenderRepository;
import com.example.demo.Repository.TimeRepository;

@Service
public class StudentService {
	
	@Autowired
	private CourseRepository courseRepo;
	
	@Autowired
	private GenderRepository GenderRepo;
	
	@Autowired
	private TimeRepository timeRepo;
	
	public List<String> getCourses(){
		List<String> course = courseRepo.getCourse();
		return course;
	}
	
	public List<Genders> getGenders(){
		List<Genders> findAll = GenderRepo.findAll();
		return findAll;
	}
	
	public List<String> getTime(){
		List<String> times = timeRepo.getTimes();
		System.out.println(times);
		return times;
	}
	
	

}
