package com.sb.stmgmt.request;

import lombok.Data;

@Data
public class StudentRequest {

	private String studentName;

//	private Integer studentRegNo;
//	private Integer studentAge;
//
//	
//	private String studentGender;
//	private String studentCategory;
//	private String studentParents;
//
//	private Date studentDob = new Date();
//	private Date studentDateOfAdmission = new Date();
//	private Date studentAcademicYear = new Date();

	private ClassRequest classRequest;
	private SectionRequest sectionRequest;
	private SubjectsRequest subjectsRequest;
	private TeacherRequest teacherRequest;

}
