package com.test.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.students.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher,Integer>{
	

}
