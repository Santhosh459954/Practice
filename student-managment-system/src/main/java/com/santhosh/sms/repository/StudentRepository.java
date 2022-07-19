package com.santhosh.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santhosh.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
