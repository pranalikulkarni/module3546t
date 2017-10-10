package com.cg.student.dao;

import java.util.ArrayList;

import com.cg.student.bean.StudentInfo;



public interface IStudentDAO {

	public int insert(StudentInfo bean);

	

	ArrayList<Integer> retrieveId();

}
