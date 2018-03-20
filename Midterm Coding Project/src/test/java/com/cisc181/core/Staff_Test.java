package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	private static ArrayList<Staff> staffmen = new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup() {
		try
		{
		staffmen.add(new Staff("Hugh", "Albert", "Janus", new Date(69, 6, 9), "Janus Hall 101", "(302)-255-1345", 
				"hugh@janus.com", "Monday 2-5 pm", 1, 250000, new Date(101, 1, 2), eTitle.MR));
		
		staffmen.add(new Staff("Bert", "TheMan", "Gibbons", new Date(70, 1, 1), "Smith Hall 1111111", "(302)-101-1001", 
				"bgibbons@udel.edu", "Wednesday 12-3 pm", 1, 500000, new Date(105, 5, 2), eTitle.MR));
		
		staffmen.add(new Staff("Alex", "H", "Sederqust", new Date(98, 7, 22), "Evans Hall 100", "(302)-547-2605", 
				"alexsed@udel.edu", "Friday 12-5 pm", 1, 75000, new Date(116, 1, 2), eTitle.MR));
		
		staffmen.add(new Staff("Ben", "Thomas", "Dover", new Date(95, 9, 19), "Ewing Hall 555", "(302)-555-5551", 
				"bdover@udel.edu", "Tuesday 5-7 pm", 1, 15000, new Date(112, 6, 20), eTitle.MR));
		
		staffmen.add(new Staff("Peyton", "W", "Smith", new Date(98, 5, 1), "Spencer Lab 201", "(537)-989-2732", 
				"pwsmith@udel.edu", "Friday 4-7 pm", 1, 85000, new Date(118, 1, 5), eTitle.MR));
		} catch (PersonException e)
		{
			fail();
		}
	}
	
	@Test
	public void test() {
		double avg = 0.0;
		for (Staff staff : staffmen)
		{
			avg += (double)staff.getSalary();
		}
		avg = avg / staffmen.size();
		
		assertEquals(avg, 185000, 0.01);
		
		try
		{
			staffmen.add(new Staff("Peyton", "W", "Smith", new Date(-500, 5, 1), "Spencer Lab 201", "(537)-989-2732", 
				"pwsmith@udel.edu", "Friday 4-7 pm", 1, 85000, new Date(118, 1, 5), eTitle.MR));
		} catch (PersonException e)
		{
			assertTrue(true);
		}
		
		try
		{
			staffmen.add(new Staff("Peyton", "W", "Smith", new Date(98, 5, 1), "Spencer Lab 201", "1010011001", 
				"pwsmith@udel.edu", "Friday 4-7 pm", 1, 85000, new Date(118, 1, 5), eTitle.MR));
		} catch (PersonException e)
		{
			assertTrue(true);
		}
	}
}
