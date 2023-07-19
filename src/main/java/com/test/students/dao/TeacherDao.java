package com.test.students.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.students.entity.Teacher;
import com.test.students.repository.TeacherRepository;

@Repository
public class TeacherDao {
	@Autowired
	TeacherRepository trRepo;
	public String addTeacher(@RequestBody Teacher s) {
		 trRepo.save(s);
		 return "Successfully saved";
	}
	public String addAllTeacher(@RequestBody List<Teacher> s) {
		 trRepo.saveAll(s);
		 return "Successfully saved";
	}
	public Teacher findTeacherId(@PathVariable int id) {
	       return trRepo.findById(id).get();
		}

}
