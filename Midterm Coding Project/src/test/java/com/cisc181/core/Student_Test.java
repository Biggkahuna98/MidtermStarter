package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.Random;

import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.*;

public class Student_Test {
	private static ArrayList<Course> courses = new ArrayList<Course>();
	private static ArrayList<Semester> semesters = new ArrayList<Semester>();
	private static ArrayList<Section> sections = new ArrayList<Section>();
	private static ArrayList<Student> students = new ArrayList<Student>();
	private static ArrayList<Enrollment> enrollments = new ArrayList<Enrollment>();
	
	@BeforeClass
	public static void setup() {
		courses.add(new Course(UUID.randomUUID(), "MATH241", 4));
		courses.add(new Course(UUID.randomUUID(), "MATH242", 4));
		courses.add(new Course(UUID.randomUUID(), "MATH243", 4));
		
		semesters.add(new Semester(UUID.randomUUID(), new Date(117, 8, 29), new Date(117, 12, 16)));
		semesters.add(new Semester(UUID.randomUUID(), new Date(118, 2, 5), new Date(118, 5, 24)));
		
		sections.add(new Section(courses.get(0).getCourseID(), semesters.get(0).getSemesterID(), UUID.randomUUID(), 100));
		sections.add(new Section(courses.get(1).getCourseID(), semesters.get(0).getSemesterID(), UUID.randomUUID(), 101));
		sections.add(new Section(courses.get(2).getCourseID(), semesters.get(0).getSemesterID(), UUID.randomUUID(), 102));
		sections.add(new Section(courses.get(0).getCourseID(), semesters.get(1).getSemesterID(), UUID.randomUUID(), 103));
		sections.add(new Section(courses.get(1).getCourseID(), semesters.get(1).getSemesterID(), UUID.randomUUID(), 104));
		sections.add(new Section(courses.get(2).getCourseID(), semesters.get(1).getSemesterID(), UUID.randomUUID(), 555));
		
		try
		{
			students.add(new Student("Alex", "H", "Sederquest", new Date(98,7,22),
					eMajor.BUSINESS, "418B George Read North", "(302)-547-2605",
					"alexsed@udel.edu"));
			students.add(new Student("Alex", "H", "Sederquest", new Date(98,7,2),
					eMajor.BUSINESS, "418B George Read North", "(302)-547-2605",
					"alexsed@udel.edu"));
			students.add(new Student("Alex", "H", "Sederquest", new Date(98,7,22),
					eMajor.NURSING, "418B George Read North", "(302)-547-2605",
					"alexsed@udel.edu"));
			students.add(new Student("Alex", "H", "Sederquest", new Date(98,7,22),
					eMajor.PHYSICS, "418B George Read North", "(302)-547-2605",
					"alexsed@udel.edu"));
			students.add(new Student("Alex", "H", "Sederquest", new Date(98,7,22),
					eMajor.COMPSI, "418B George Read North", "(302)-547-2605",
					"alexsed@udel.edu"));
			students.add(new Student("Alex", "H", "Sederquest", new Date(98,7,22),
					eMajor.COMPSI, "418B George Read North", "(302)-547-2605",
					"alexsed@udel.edu"));
			students.add(new Student("Alex", "H", "Sederquest", new Date(98,7,22),
					eMajor.CHEM, "418B George Read North", "(302)-547-2605",
					"alexsed@udel.edu"));
			students.add(new Student("Alex", "H", "Sederquest", new Date(98,7,22),
					eMajor.CHEM, "418B George Read North", "(302)-547-2605",
					"alexsed@udel.edu"));
			students.add(new Student("Alex", "H", "Sederquest", new Date(98,7,22),
					eMajor.COMPSI, "418B George Read North", "(302)-547-2605",
					"alexsed@udel.edu"));
			students.add(new Student("Alex", "H", "Sederquest", new Date(98,7,22),
					eMajor.BUSINESS, "418B George Read North", "(302)-547-2605",
					"alexsed@udel.edu"));
		} catch (PersonException e)
		{
			fail();
		}
		
		for (Section se : sections)
		{
			for (Student st : students)
			{
				enrollments.add(new Enrollment(se.getSectionID(), st.getStudentID()));
			}
		}
		
		for (Enrollment en : enrollments)
		{
			Random rng = new Random();
			en.setGrade(rng.nextInt(100) + 1);
		}
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
}