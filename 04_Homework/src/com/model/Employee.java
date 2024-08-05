package com.model;

public class Employee {
	private int emp_id;
	private String name;
	private int salary;
	
	public Employee()
	{
		
	}
	
	public Employee(int e, String n, int s)
	{
		 int emp_id = e;
		 String name= n;
		 int salary = s;
	}

	public void setId(int e) {
		emp_id = e;
	}

	public int getId() {
		return emp_id;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setSalary(int s)
	{
		salary = s;
	}
	public int getSalary()
	{
		return salary;
	}

}
