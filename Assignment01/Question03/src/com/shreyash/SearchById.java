package com.shreyash;

import java.util.Scanner;

public class SearchById {

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

		System.out.print("\nEnter Employee Id To Search - ");
		int key = sc.nextInt();
		linearSearch(arr, key);
	}

	public static int linearSearch(Employee[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].id == key) {
				System.out.println("Employee Id Found at Index - " + i);
				return i;
			}

		}
		System.out.println("Employee Id Not Found");
		return -1;

	}
}
