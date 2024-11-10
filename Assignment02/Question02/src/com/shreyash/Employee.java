package com.shreyash;

import java.util.Scanner;

public class Employee {

	int id = ++generateId;
	static int generateId = 0;
	String name;
	double salary;

	public Employee() {
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void accept(Scanner sc) {
		System.out.print("\nEnter Employee Name - ");
		name = sc.next();
		System.out.print("Enter Employee Salary - ");
		salary = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Employee [Id = " + id + ", Name = " + name + ", Salary = " + salary + "]";
	}

}
