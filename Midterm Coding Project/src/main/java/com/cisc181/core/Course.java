package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;

	
	
	public Course(UUID CourseID, String CourseName, eMajor Major){
		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.Major = Major;
		
		
}



	public UUID getCourseID() {
		return CourseID;
	}



	public void setCourseID(UUID courseID) {
		CourseID = courseID;
	}
