package com.app.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepo;
import com.app.serviceint.StudentServiceInt;

@Service
public class StudentServiceImpl implements StudentServiceInt {

	@Autowired
	StudentRepo sr;
	@Override
	public Student saveStudent(Student student) {
		Student stu=sr.save(student);
		return stu;
	}
	@Override
	public List<Student> getStudents() {
		List<Student> stuList=sr.findAll();
		return stuList;
	}

}
