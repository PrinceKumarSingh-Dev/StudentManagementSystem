package com.sb.stmgmt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import lombok.Data;

@Entity
@Table
@Data
public class TeacherEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer teacherId;
	private String teacherName;
	
//	private Integer teacherStaffNo;
//	private Integer teacherAge;
//
//	
//	private String teacherGender;
//	private String teacherCategory;
//
//	private Date teacherDob;
//	private Date teacherDateOfJoining;

	@ColumnDefault(value = "0")
	private Boolean deleted = false;

	}
