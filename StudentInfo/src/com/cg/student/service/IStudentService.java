package com.cg.student.service;

import java.util.ArrayList;

import com.cg.student.bean.StudentInfo;



public interface IStudentService {



	ArrayList<Integer> retrieveId();

	public int insert(StudentInfo bean);

	

	String givegrade(int total);

}
