package com.sb.stmgmt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import lombok.Data;

@Entity
@Table
@Data
public class StudentEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	private String studentName;
//	
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

	@ColumnDefault(value = "0")
	private Boolean deleted = false;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacherId", nullable = false, referencedColumnName = "teacherId")
//	@ManyToMany
//	@JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))

	private TeacherEntity teacherEntity;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sectionId", nullable = false, referencedColumnName = "sectionId")
	private SectionEntity sectionEntity;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "classId", nullable = false, referencedColumnName = "classId")
	private ClassEntity classEntity;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "subjectsId", nullable = false, referencedColumnName = "subjectsId")
	private SubjectsEntity subjectsEntity;

}
