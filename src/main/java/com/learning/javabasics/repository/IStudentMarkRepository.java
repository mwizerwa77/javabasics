package com.learning.javabasics.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.javabasics.model.StudentMark;

@Repository
public interface IStudentMarkRepository extends JpaRepository<StudentMark, Integer> {
}
//save -- insert into student babababa
//update -- update student
//delete -- delete
//GET-- select