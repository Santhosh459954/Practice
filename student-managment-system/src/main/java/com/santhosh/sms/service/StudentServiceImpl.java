package com.santhosh.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santhosh.sms.entity.Student;
import com.santhosh.sms.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student findStudentById(long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public void deleteStudent(Student student) {
		studentRepository.delete(student);
	}

	@Override
	public void deleteStudentById(long id) {
		// TODO Auto-generated method stub
		 studentRepository.deleteById(id);
	}

}
