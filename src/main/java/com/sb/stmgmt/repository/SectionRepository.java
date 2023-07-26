package com.sb.stmgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.stmgmt.entity.SectionEntity;

@Repository
public interface SectionRepository extends JpaRepository<SectionEntity, Integer> {

}
