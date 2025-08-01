package com.vtech.studenManagemnt.service;

import java.util.ArrayList;
import java.util.Iterator;

import com.vtech.studenManagemnt.models.Student;

public class StudentService {
	private ArrayList<Student> studentList = new ArrayList<>();
	public void addStudent(Student student) {
     	studentList.add(student);
		System.out.println("student data added successfully");
	}
	public void viewStudent() {
		studentList.stream().forEach(s->System.out.println(s.toString()));
		}
	public void updateStudent(Student student) {
		for(Student s:studentList) {
			if(student.getStudentId()==s.getStudentId()) {
				s.setName(student.getName());
				s.setAge(student.getAge());
				System.out.println("Updated successfully"+toString());
			}
			else {
				System.out.println("not avilable"+ s.getStudentId());
			}
			
		}
	}
public void deleteStudent(int id) {
	Iterator<Student>iterator=studentList.iterator();
	
	while(iterator.hasNext()) {
		Student s= iterator.next()	;
		if(id==s.getStudentId()) {
			iterator.remove();
			System.out.println("deleted");
			return;
		}
		
	}
	System.out.println("no student present"+id);
	
	
}

}
