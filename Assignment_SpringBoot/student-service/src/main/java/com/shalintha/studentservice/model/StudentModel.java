package com.shalintha.studentservice.model;

import java.util.ArrayList;
import java.util.List;

public class StudentModel {
	
	public static List<Student> getAllStudents(){
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Kamala", 75));
		students.add(new Student("Saman", 90));
		students.add(new Student("Nimal", 40));
		students.add(new Student("Kamal", 35));
		students.add(new Student("Dinuka", 60));
		
		return students;
		
	}

}
