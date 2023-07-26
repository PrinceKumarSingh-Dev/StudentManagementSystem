package com.sb.stmgmt.response;

import lombok.Data;

@Data
public class StudentResponse {
	private Integer studentId;
	private String studentName;

//	private Integer studentRegNo;
//	private Integer studentAge;
//
//	
//	private String studentGender;
//	private String studentCategory;
//	private String studentParents;
//
//	private Date studentDob;
//	private Date studentDateOfAdmission;
//	private Date studentAcademicYear;

	private ClassResponse classResponse;
	private SectionResponse sectionResponse;
	private SubjectsResponse subjectsResponse;
	private TeacherResponse teacherResponse;

}
