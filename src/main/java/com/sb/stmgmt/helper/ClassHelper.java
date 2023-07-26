//************************************************************************************************************************************************************************************************************************88
/*
 * package com.sb.stmgmt.helper;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * import org.springframework.stereotype.Component;
 * 
 * import com.sb.stmgmt.entity.ClassEntity; import
 * com.sb.stmgmt.entity.SectionEntity; import
 * com.sb.stmgmt.entity.StudentEntity; import
 * com.sb.stmgmt.entity.SubjectsEntity; import
 * com.sb.stmgmt.entity.TeacherEntity; import
 * com.sb.stmgmt.request.ClassRequest;
 * 
 * import lombok.Data;
 * 
 * @Component
 * 
 * @Data public class ClassHelper {
 * 
 * // save data to database public ClassEntity getFromClassRequest(ClassRequest
 * classRequest) { // class 1: M Section 1 : M Student // class 1: M Subject 1 :
 * 1 Teacher
 * //@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
 * @@@@@@@@@@@@@@@@@@@@@@@@@@@@ //create object for saving to database
 * ClassEntity classEntity = new ClassEntity();
 * 
 * SectionEntity sectionEntityObj = new SectionEntity();
 * 
 * TeacherEntity teacherEntity = new TeacherEntity();
 * 
 * SubjectsEntity subjectsEntityObj = new SubjectsEntity();
 * 
 * //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 * 
 * // created normal list for saving list objects related list
 * 
 * List<SectionEntity> sectionEntityList = new ArrayList<>();
 * 
 * List<StudentEntity> studentEntityList = new ArrayList<>();
 * 
 * List<SubjectsEntity> subjectsEntityList = new ArrayList<>();
 * //---------------------------------------------------------------------------
 * -------------------------- // Get Each Section name from Section request.
 * classRequest.getSectionRequest().forEach(section -> {
 * 
 * SectionEntity sectionEntity = new SectionEntity();
 * sectionEntity.setSectionName(section.getSectionName());
 * sectionEntityList.add(sectionEntity);
 * //***************************************************************************
 * **************************** // get Each student details from student request
 * because student are in section variable list
 * section.getStudentRequest().forEach(student -> { StudentEntity studentEntity
 * = new StudentEntity();
 * 
 * studentEntity.setStudentAcademicYear(student.getStudentAcademicYear());
 * studentEntity.setStudentAge(student.getStudentAge());
 * studentEntity.setStudentCategory(student.getStudentCategory());
 * studentEntity.setStudentDateOfAdmission(student.getStudentAcademicYear());
 * studentEntity.setStudentDob(student.getStudentDob());
 * studentEntity.setStudentGender(student.getStudentGender());
 * studentEntity.setStudentName(student.getStudentName());
 * studentEntity.setStudentParents(student.getStudentParents());
 * studentEntity.setStudentRegNo(student.getStudentRegNo());
 * studentEntityList.add(studentEntity); });
 * //***************************************************************************
 * ******************************* });
 * 
 * // Get Each Subject name from subject request.
 * classRequest.getSubjectsRequest().forEach(subject -> {
 * 
 * SubjectsEntity subjectsEntity = new SubjectsEntity();
 * 
 * subjectsEntity.setSubjectsName(subject.getSubjectsName());
 * 
 * subjectsEntityList.add(subjectsEntity);
 * teacherEntity.setTeacherAge(subject.getTeacherRequest().getTeacherAge());
 * teacherEntity.setTeacherCategory(subject.getTeacherRequest().
 * getTeacherCategory());
 * teacherEntity.setTeacherDateOfJoining(subject.getTeacherRequest().
 * getTeacherDateOfJoining());
 * teacherEntity.setTeacherCategory(subject.getTeacherRequest().
 * getTeacherCategory());
 * teacherEntity.setTeacherDob(subject.getTeacherRequest().getTeacherDob());
 * teacherEntity.setTeacherGender(subject.getTeacherRequest().getTeacherGender()
 * );
 * teacherEntity.setTeacherName(subject.getTeacherRequest().getTeacherName());
 * teacherEntity.setTeacherStaffNo(subject.getTeacherRequest().getTeacherStaffNo
 * ());
 * 
 * });
 * 
 * //---------------------------------------------------------------------------
 * ------------------------------- // Set Class entity.
 * classEntity.setClassName(classRequest.getClassName()); // set SectionEntity
 * classEntity.setSectionEntitieList(sectionEntityList); // set subject entity
 * classEntity.setSubjectsEntity(subjectsEntityList); // set student entity
 * sectionEntityObj.setStudentEntitieList(studentEntityList); // set teacher
 * subjectsEntityObj.setTeacherEntity(teacherEntity); System.out.println(
 * "****************************************************************");
 * System.out.println(classEntity); System.out.println(sectionEntityObj);
 * System.out.println(teacherEntity); System.out.println(subjectsEntityObj);
 * 
 * return classEntity;
 * 
 * }
 * 
 * }
 */