package com.test.students.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.students.entity.Students;

public interface StudentsRepository extends JpaRepository<Students, Integer> {

}
