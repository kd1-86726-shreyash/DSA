package com.shreyash;

import java.util.Scanner;

public class SearchByName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee[] arr = new Employee[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Employee();
			arr[i].accept(sc);
		}

		System.out.println();
		for (Employee employee : arr) {
			System.out.println(employee);
		}

		System.out.println("Enter Employee Name To Search - ");
		String name = sc.next();

		linearSearch(arr, name);
	}

	private static int linearSearch(Employee[] arr, String name) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getName().equals(name)) {
				System.out.println("\nEmployee Name Found At Index - " + i);
				return i;
			}

		}
		System.out.println("Employee Not Found");
		return -1;

	}
}
