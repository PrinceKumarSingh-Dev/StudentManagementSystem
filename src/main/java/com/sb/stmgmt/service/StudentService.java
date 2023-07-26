package com.sb.stmgmt.service;

import java.util.List;

import com.sb.stmgmt.request.StudentRequest;
import com.sb.stmgmt.response.StudentResponse;

public interface StudentService {

	StudentResponse saveStudent(StudentRequest studentRequest);

	List<StudentResponse> getAll();

	StudentResponse getById(int id);

	void deleteById(int id);

}
