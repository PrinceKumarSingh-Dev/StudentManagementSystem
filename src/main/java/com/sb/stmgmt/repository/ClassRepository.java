package com.sb.stmgmt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.stmgmt.entity.ClassEntity;
import com.sb.stmgmt.entity.StudentEntity;

@Repository
public interface ClassRepository extends JpaRepository<ClassEntity, Integer> {

	

}
