package com.learning.javabasics.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.javabasics.model.Student;
import com.learning.javabasics.repository.IStudentRepository;

@RestController
@RequestMapping("/v1/api/students")
public class StudentController {

	@Autowired
	private IStudentRepository studentRepository;

	@GetMapping("/all")
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	@PostMapping("/new")
	public ResponseEntity<?> newRecord(@RequestBody Student student) {

		studentRepository.save(student);

		return ResponseEntity.status(HttpStatus.CREATED).body("Saved successfully");
	}
	
	@PutMapping("/id/{id}")
	public ResponseEntity<?> updateRecord(@PathVariable(value = "id") int id,
			@RequestBody Student newData){
	
		Optional<Student> studentExisting = studentRepository.findById(id);
		if(studentExisting.isPresent()) {
			Student updateStudent = studentExisting.get();
			updateStudent.setAccountBalance(newData.getAccountBalance());
			updateStudent.setAge(newData.getAge());
			updateStudent.setFirstName(newData.getFirstName());
			updateStudent.setLastName(newData.getLastName());
			updateStudent.setStudentNumber(newData.getStudentNumber());
			
			studentRepository.save(updateStudent);
		}
		
		return ResponseEntity.status(HttpStatus.OK).body("Record updated successfully");
	}
	
	@DeleteMapping("/id/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") int id){
		
		studentRepository.deleteById(id);
		
		return ResponseEntity.status(HttpStatus.OK).body("Record deleted successfully");
	}

}
