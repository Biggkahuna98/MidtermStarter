package com.cisc181.core;

public class PersonException extends Exception
{
	private Person PersonState;
	
	public PersonException(Person p, String msg)
	{
		super(msg);
		this.PersonState = p;
	}
}
