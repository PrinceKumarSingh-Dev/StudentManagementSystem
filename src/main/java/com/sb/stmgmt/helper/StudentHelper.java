package com.sb.stmgmt.helper;

import org.springframework.stereotype.Component;

import com.sb.stmgmt.entity.ClassEntity;
import com.sb.stmgmt.entity.SectionEntity;
import com.sb.stmgmt.entity.StudentEntity;
import com.sb.stmgmt.entity.SubjectsEntity;
import com.sb.stmgmt.entity.TeacherEntity;
import com.sb.stmgmt.request.StudentRequest;
import com.sb.stmgmt.response.ClassResponse;
import com.sb.stmgmt.response.SectionResponse;
import com.sb.stmgmt.response.StudentResponse;
import com.sb.stmgmt.response.SubjectsResponse;
import com.sb.stmgmt.response.TeacherResponse;

import lombok.Data;

@Component
@Data

public class StudentHelper {

	public StudentEntity getDataFromStudentRequest(StudentRequest studentRequest) {
		System.out.println(studentRequest.getClassRequest().getClassName());
	

		ClassEntity classEntity = new ClassEntity();
		classEntity.setClassName(studentRequest.getClassRequest().getClassName());

		SectionEntity sectionEntity = new SectionEntity();
		sectionEntity.setSectionName(studentRequest.getSectionRequest().getSectionName());

		SubjectsEntity subjectsEntity = new SubjectsEntity();
		subjectsEntity.setSubjectsName(studentRequest.getSubjectsRequest().getSubjectsName());

		TeacherEntity teacherEntity = new TeacherEntity();
		teacherEntity.setTeacherName(studentRequest.getTeacherRequest().getTeacherName());

		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setStudentName(studentRequest.getStudentName());
		studentEntity.setClassEntity(classEntity);
		studentEntity.setSectionEntity(sectionEntity);
		studentEntity.setSubjectsEntity(subjectsEntity);
		studentEntity.setTeacherEntity(teacherEntity);

		return studentEntity;

	}

	public StudentResponse getDataFromStudentResponse(StudentEntity studentEntity) {

		ClassResponse classResponse = new ClassResponse();
		classResponse.setClasssId(studentEntity.getClassEntity().getClassId());
		classResponse.setClasssName(studentEntity.getClassEntity().getClassName());

		SectionResponse sectionResponse = new SectionResponse();
		sectionResponse.setSectionId(studentEntity.getSectionEntity().getSectionId());
		sectionResponse.setSectionName(studentEntity.getSectionEntity().getSectionName());

		SubjectsResponse subjectsResponse = new SubjectsResponse();
		subjectsResponse.setSubjectsId(studentEntity.getSubjectsEntity().getSubjectsId());
		subjectsResponse.setSubjectsName(studentEntity.getSubjectsEntity().getSubjectsName());

		TeacherResponse teacherResponse = new TeacherResponse();
		teacherResponse.setTeacherId(studentEntity.getTeacherEntity().getTeacherId());
		teacherResponse.setTeacherName(studentEntity.getTeacherEntity().getTeacherName());

		StudentResponse studentResponse = new StudentResponse();
		studentResponse.setStudentId(studentEntity.getStudentId());
		studentResponse.setStudentName(studentEntity.getStudentName());
		studentResponse.setClassResponse(classResponse);
		studentResponse.setSectionResponse(sectionResponse);
		studentResponse.setSubjectsResponse(subjectsResponse);
		studentResponse.setTeacherResponse(teacherResponse);

		return studentResponse;

	}

}
