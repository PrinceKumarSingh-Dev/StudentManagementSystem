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
public class SubjectsEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer subjectsId;

	private String subjectsName;

	@ColumnDefault(value = "0")
	private Boolean deleted = false;

}
