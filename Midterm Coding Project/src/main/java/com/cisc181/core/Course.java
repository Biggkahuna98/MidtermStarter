package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.*;

public class Course
{
	private UUID CourseID;
	private String CourseName;
	private int GradePoint;
	private eMajor Major;

	public Course(UUID courseID, String courseName, int gradePoint)
	{
		super();
		CourseID = courseID;
		CourseName = courseName;
		GradePoint = gradePoint;
	}
	
	public Course()
	{
		
	}

	public UUID getCourseID()
	{
		return CourseID;
	}

	public void setCourseID(UUID courseID)
	{
		CourseID = courseID;
	}

	public String getCourseName()
	{
		return CourseName;
	}

	public void setCourseName(String courseName)
	{
		CourseName = courseName;
	}

	public int getGradePoint()
	{
		return GradePoint;
	}

	public void setGradePoint(int gradePoint)
	{
		GradePoint = gradePoint;
	}
	
	public eMajor getMajor()
	{
		return Major;
	}

	public void setMajor(eMajor major)
	{
		Major = major;
	}
}
