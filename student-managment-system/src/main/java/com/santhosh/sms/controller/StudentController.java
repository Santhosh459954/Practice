package com.santhosh.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santhosh.sms.entity.Student;
import com.santhosh.sms.service.StudentService;

@Controller
public class StudentController {
	
	StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	@GetMapping("/students")
	public String getAllStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "studentsList";
	}
	
	@GetMapping("/students/new")
	public String addStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "createstudent";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student")Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.findStudentById(id));
		return "editStudent";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student")Student student,
			Model model) {
		Student existingStudent = new Student();
		existingStudent = studentService.findStudentById(id);
		existingStudent.setId(id);
		existingStudent.setEmail(student.getEmail());
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		model.addAttribute("student", studentService.saveStudent(existingStudent));
		return "redirect:/students";
	}
	
	@GetMapping("/students/delete/{id}")
	public String deleteStudent(@PathVariable Long id, Model model) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
}
