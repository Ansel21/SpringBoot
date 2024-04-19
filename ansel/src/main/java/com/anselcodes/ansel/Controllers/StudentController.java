package com.anselcodes.ansel.Controllers;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anselcodes.ansel.Services.StudentService;

import Students.Student;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {
    private final StudentService studentService;
    
	public StudentController(StudentService studentService){
         this.studentService = studentService;
	}

	@GetMapping
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
}
