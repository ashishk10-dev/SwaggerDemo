package com.app.serviceint;

import java.util.List;

import com.app.model.Student;

public interface StudentServiceInt {

	public Student saveStudent(Student student);

	public List<Student> getStudents();

}
