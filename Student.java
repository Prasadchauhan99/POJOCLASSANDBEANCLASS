package com.pojo.in;

public class Student {
	
	private int roll;
	private String name;
	private String school;
	
	public Student()
	{
		System.out.println("No argument constructor");
	}
	public Student(int roll)
	{
		this.roll=roll;
	}
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public int getRoll()
	{
		return roll;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSchool(String school)
	{
		this.school=school;
	}
	public String getSchool()
	{
		return school;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", school=" + school + "]";
	}
	
	
	

}
