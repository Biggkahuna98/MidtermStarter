package com.cisc181.core;

import java.util.UUID;

public class Enrollment
{
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	public Enrollment(UUID sectionID, UUID studentID)
	{
		super();
		SectionID = sectionID;
		StudentID = studentID;
		
		EnrollmentID = UUID.randomUUID();
	}
	
	private Enrollment()
	{
		super();
	}
	
	public void setGrade(double g)
	{
		Grade = g;
	}
}
