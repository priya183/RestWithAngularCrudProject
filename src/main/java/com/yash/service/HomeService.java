package com.yash.service;

import java.util.List;
import java.util.Optional;

import com.yash.model.StudentForm;

public interface HomeService {

	public void SaveData(StudentForm sf);
	public List<StudentForm> GetAllStudentForm();
	public void deleteData(int sid);
	public StudentForm updateData(StudentForm sf);
	public void UpdateData(StudentForm sf) ;
	 public StudentForm getStudentById(int id);
	
}
