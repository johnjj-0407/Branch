package com.test.students.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.students.entity.Teacher;
import com.test.students.service.TeacherService;

@RestController
public class TeacherController {
	@Autowired
	TeacherService trSer;
	@PostMapping(value = "/insertTeacher")
	public String addTeacher(@RequestBody Teacher s) {
		return trSer.addTeacher(s);
	}
	@PostMapping(value = "/insertAllTeacher")
	public String addAllTeacher(@RequestBody List<Teacher> s) {
		return trSer.addAllTeacher(s);
	}
	@GetMapping(value = "/findTeacher/{id}")
	public Teacher findTeacherId(@PathVariable int id) {
       return trSer.findTeacherId(id);
	}


}
