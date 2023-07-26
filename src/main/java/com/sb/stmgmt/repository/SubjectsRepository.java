package com.sb.stmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.stmgmt.entity.SubjectsEntity;
@Repository
public interface SubjectsRepository extends JpaRepository<SubjectsEntity, Integer> {

}
