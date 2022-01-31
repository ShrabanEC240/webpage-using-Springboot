package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Entities.StudentEntity;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;
import com.example.demo.binding.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studSevice;
	
	@Autowired
	private StudentRepository studRepo;
	
	@GetMapping("/student")
	public String getRegForm(Model model) {
		
		List<String> obj = new ArrayList();
		obj.add("male");
		obj.add("female");
		model.addAttribute("course", studSevice.getCourses());
			model.addAttribute("gender", obj);
		model.addAttribute("timing", studSevice.getTime());
		model.addAttribute("student", new Student());
		return "regForm";
	}
	
	@PostMapping("/saveStudent")
	public String saveStudent(Student objStudent) {
        StudentEntity objStudentEntity = new StudentEntity();
        BeanUtils.copyProperties(objStudent, objStudentEntity);
        studRepo.save(objStudentEntity);
        System.out.println(objStudentEntity);
		return "saveSuccessful";
	}

}
