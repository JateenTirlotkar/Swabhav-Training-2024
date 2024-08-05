package com.test;
import java.util.*;

import com.model.Employee;
import com.model.EmployeeComparator;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> employee = new ArrayList<>();
		employee.add(new Employee (1,"John",1000));
		employee.add(new Employee (2,"Rosie",3000));
		employee.add(new Employee (3,"Robert",5000));
		
		
		System.out.println(employee);
		System.out.println("");
		
		Collections.sort(employee, new EmployeeComparator.EmployeeIdComparator());
		System.out.println(employee);
		System.out.println("");
		Collections.sort(employee, new EmployeeComparator.EmployeeSalaryComparator());
		System.out.println(employee);
		System.out.println("");
		Collections.sort(employee, new EmployeeComparator.EmployeeNameComparator());
		System.out.println(employee);
	}

}
