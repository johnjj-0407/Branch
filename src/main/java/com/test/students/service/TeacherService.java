package com.test.students.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.students.dao.TeacherDao;
import com.test.students.entity.Teacher;

@Service
public class TeacherService {
	@Autowired
	TeacherDao trDao;
	public String addTeacher( Teacher s) {
		return trDao.addTeacher(s);
	}
	public String addAllTeacher(@RequestBody List<Teacher> s) {
		return trDao.addAllTeacher(s);
	}
	public Teacher findTeacherId(@PathVariable int id) {
	       return trDao.findTeacherId(id);
		}

}
