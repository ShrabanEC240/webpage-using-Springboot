package com.example.demo.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entities.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Serializable>{

}
