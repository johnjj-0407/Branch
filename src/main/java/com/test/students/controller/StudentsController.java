package com.test.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.students.entity.Students;
import com.test.students.service.StudentsService;

@RestController
public class StudentsController {
	@Autowired
	StudentsService stuSer;

	@PostMapping(value = "/insertStudent")
	public String addStudents(@RequestBody Students s) {
		return stuSer.addStudents(s);
	}
	@PostMapping(value = "/insertAllStudent")
	public String addAllStudents(@RequestBody List<Students> s) {
		return stuSer.addAllStudents(s);
	}
	@GetMapping(value = "/findStudent/{id}")
	public Students findStudentId(@PathVariable int id) {
       
		return stuSer.findStudentId(id);
	}
	@GetMapping(value = "/findStudents")
	public List<Students> findStudents(@RequestBody List<Students>s) {
       
		return stuSer.findStudents(s);
	}
	@DeleteMapping(value = "/DeleteStudent/{id}")
	public String DeleteStudentId(@PathVariable int id) {
       
		return stuSer.DeleteStudentId(id);
	}
	@PutMapping(value="/UpdateStudent/{id}")
	public String updateStudent(@RequestBody Students id) {
		return stuSer.updateStudent(id);
	}
	@GetMapping(value="/hi")
	public String getHi() {
		return "hello";
	}
}
