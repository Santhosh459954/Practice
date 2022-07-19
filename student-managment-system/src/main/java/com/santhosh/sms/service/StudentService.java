package com.santhosh.sms.service;

import java.util.List;

import com.santhosh.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	Student findStudentById(long id);
	void deleteStudentById(long id);
	void deleteStudent(Student student);
}
