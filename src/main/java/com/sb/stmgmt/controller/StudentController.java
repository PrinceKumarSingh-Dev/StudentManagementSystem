package com.sb.stmgmt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sb.stmgmt.request.StudentRequest;
import com.sb.stmgmt.response.StudentResponse;
import com.sb.stmgmt.service.StudentService;

@RestController
@RequestMapping("/api/studentmgmtsys")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/save")
	public ResponseEntity<StudentResponse> saveStandards(@RequestBody StudentRequest studentRequest) {
		return new ResponseEntity<StudentResponse>(studentService.saveStudent(studentRequest), HttpStatus.OK);
	}

	@GetMapping("/getall")
	public ResponseEntity<List<StudentResponse>> getAll() {
		return new ResponseEntity<List<StudentResponse>>(studentService.getAll(), HttpStatus.OK);

	}

	@GetMapping("/get/{id}")
	public ResponseEntity<StudentResponse> getById(@PathVariable int id) {
		return new ResponseEntity<StudentResponse>(studentService.getById(id), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable int id) {

		studentService.deleteById(id);
		return new ResponseEntity<String>("Student has been deleted", HttpStatus.OK);
	}
}
