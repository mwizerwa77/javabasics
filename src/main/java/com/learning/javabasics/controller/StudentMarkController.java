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

import com.learning.javabasics.dto.CreateMarkDTO;
import com.learning.javabasics.model.Student;
import com.learning.javabasics.model.StudentMark;
import com.learning.javabasics.repository.IStudentMarkRepository;
import com.learning.javabasics.repository.IStudentRepository;

@RestController
@RequestMapping("/v1/api/marks")
public class StudentMarkController {

	@Autowired
	private IStudentRepository studentRepository;

	@Autowired
	private IStudentMarkRepository markRepository;

	@GetMapping("/all")
	public List<StudentMark> getAll() {
		return markRepository.findAll();
	}

	@PostMapping("/new")
	public ResponseEntity<?> newRecord(@RequestBody CreateMarkDTO dto) {

		StudentMark mark = new StudentMark();

		Optional<Student> student = studentRepository.findById(dto.getStudent());
		if (!student.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No student found by id " + dto.getStudent());
		}
		mark.setMax(dto.getMax());
		mark.setScore(dto.getScore());
		mark.setSubject(dto.getSubject());
		mark.setStudent(student.get());
		markRepository.save(mark);

		return ResponseEntity.status(HttpStatus.CREATED).body("Saved successfully");
	}

	@PutMapping("/id/{id}")
	public ResponseEntity<?> updateRecord(@PathVariable(value = "id") int id, @RequestBody CreateMarkDTO dto) {

		Optional<StudentMark> studentExisting = markRepository.findById(id);
		if (!studentExisting.isPresent()) {

			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No student marks found by id " + id);

		}
		Optional<Student> student = studentRepository.findById(dto.getStudent());
		if (!student.isPresent()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No student found by id " + dto.getStudent());
		}

		StudentMark updateStudent = studentExisting.get();
		updateStudent.setMax(dto.getMax());
		updateStudent.setScore(dto.getScore());
		updateStudent.setStudent(student.get());
		updateStudent.setSubject(dto.getSubject());

		markRepository.save(updateStudent);
		return ResponseEntity.status(HttpStatus.OK).body("Record updated successfully");
	}

	@DeleteMapping("/id/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") int id) {

		studentRepository.deleteById(id);

		return ResponseEntity.status(HttpStatus.OK).body("Record deleted successfully");
	}

}
