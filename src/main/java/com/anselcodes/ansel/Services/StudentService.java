package com.anselcodes.ansel.Services;
import Students.Student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class StudentService {
	public List<Student> getStudents(){
		return List.of(
			new Student(
				1L,
				"Ansel Evander",
				191201004L,
				21,
				LocalDate.of(2001,12,21),
				"ansel.evander@email.com"

			)
		);
	}    
}
