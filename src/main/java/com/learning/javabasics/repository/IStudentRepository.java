package com.learning.javabasics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.javabasics.model.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {
}
//save -- insert into student babababa
//update -- update student
//delete -- delete
//GET-- select