package com.shreyash;

import java.util.Scanner;

public class SortEmployeeBySalary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Employee[] earr = new Employee[3];

		for (int i = 0; i < earr.length; i++) {
			earr[i] = new Employee();
			earr[i].accept(sc);
		}

		System.out.println("Before Sorting - ");
		for (Employee employee : earr) {
			System.out.println(employee);
		}

		sortBySalary(earr, earr.length);

		System.out.println("\nAfter Sorting - ");
		for (Employee employee : earr) {
			System.out.println(employee);
		}
	}

	public static void sortBySalary(Employee[] arr, int length) {

		for (int i = 0; i < length - 1; i++) {

			for (int j = i + 1; j < length; j++) {
				if (arr[i].getSalary() > arr[j].getSalary()) {
					Employee temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}

		}

	}
}
