package com.test.students.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.test.students.entity.Students;
import com.test.students.repository.StudentsRepository;

@Repository
public class StudentsDao {
	@Autowired
	StudentsRepository stuRepo;

	public String addStudents(@RequestBody Students s) {
		stuRepo.save(s);
		return "Successfully saved";
	}

	public String addAllStudents(@RequestBody List<Students> s) {
		stuRepo.saveAll(s);
		return "Successfully saved";
	}

	public Students findStudentId(@PathVariable int id) {

		return stuRepo.findById(id).get();
	}
	public List<Students> findStudents(@RequestBody List<Students>s) {
	       
		return stuRepo.findAll();
	}
	public String DeleteStudentId(@PathVariable int id) {
	       
		 stuRepo.deleteById(id);
		 return "Successfully Deleted" ;
	}
	public String updateStudent(@RequestBody Students id) {
		 stuRepo.save(id);
		 return "Successfully Updated";
	}
	

}
