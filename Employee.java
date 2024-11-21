package com.bean.in;

public class Employee {

	
	private int eid;
	private String ename;
	private double esalary;
	
	
	public Employee()
	{
		
	}
	public Employee(int eid, String ename)
	{
		
	}
	
	public void  setID(int eid)
	{
		this.eid=eid;
	}
	public int getID()
	{
		return eid;
	}
	
	public void setEname(String ename)
	{
		this.ename=ename;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEsal(double esalary)
	{
		this.esalary=esalary;
	}
	public double getEsal() {
		return esalary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
	
	
	
}
