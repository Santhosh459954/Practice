package com.santhosh.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.santhosh.sms.entity.Student;
import com.santhosh.sms.repository.StudentRepository;
import com.santhosh.sms.service.StudentService;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		 * Student student = new
		 * Student(1,"Santhosh","Keshavarapu","santhosh.210588@gmail.com"); Student
		 * student2 = new
		 * Student(2,"Santhosh2","Keshavarapu","santhosh.2105882@gmail.com"); Student
		 * student3 = new
		 * Student(3,"Santhosh3","Keshavarapu","santhosh.2105883@gmail.com");
		 * studentRepository.save(student); studentRepository.save(student2);
		 * studentRepository.save(student3);
		 */
	}

}
