package com.sb.stmgmt.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sb.stmgmt.entity.StudentEntity;
import com.sb.stmgmt.helper.StudentHelper;
import com.sb.stmgmt.repository.StudentRepository;
import com.sb.stmgmt.request.StudentRequest;
import com.sb.stmgmt.response.StudentResponse;
import com.sb.stmgmt.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private StudentHelper studentHelper;

	@Override
	public StudentResponse saveStudent(StudentRequest studentRequest) {

		StudentEntity dataFromStudentRequest = studentHelper.getDataFromStudentRequest(studentRequest);
		studentRepository.save(dataFromStudentRequest);

		return studentHelper.getDataFromStudentResponse(dataFromStudentRequest);
	}

	@Override
	public List<StudentResponse> getAll() {
		List<StudentEntity> list = studentRepository.findAllByDeletedFalse();

		List<StudentResponse> collect = list.stream().map(studentHelper::getDataFromStudentResponse)
				.collect(Collectors.toList());

		return collect;

	}

	@Override
	public StudentResponse getById(int id) {
		StudentEntity studentEntity = studentRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("id not found"));
		StudentResponse studentResponse = studentHelper.getDataFromStudentResponse(studentEntity);

		return studentResponse;
	}

	@Override
	public void deleteById(int id) {

		StudentEntity studentEntity = studentRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("id not found"));
		if (studentEntity.getDeleted() == false) {
			studentEntity.setDeleted(true);
		}
		studentRepository.save(studentEntity);

	}

}