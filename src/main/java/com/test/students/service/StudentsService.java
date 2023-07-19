package com.test.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.students.dao.StudentsDao;
import com.test.students.entity.Students;

@Service
public class StudentsService {
	@Autowired
	StudentsDao stuDao;
	
	public String addStudents(@RequestBody Students s) {
		return stuDao.addStudents(s);
	}
	public String addAllStudents(@RequestBody List<Students> s) {
		return stuDao.addAllStudents(s);
	}
	public Students findStudentId(@PathVariable int id) {
	       
		return stuDao.findStudentId(id);
	}
	public List<Students> findStudents(@RequestBody List<Students>s) {
	       
		return stuDao.findStudents(s);
	}
	public String DeleteStudentId(@PathVariable int id) {
	       
		return stuDao.DeleteStudentId(id);
	}
	public String updateStudent(@RequestBody Students id) {
		return stuDao.updateStudent(id);
	}
	public String getHi() {
		return "hello";
	}
	

}
