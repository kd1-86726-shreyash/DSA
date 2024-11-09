package com.shreyash;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchComparisons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 44, 22, 77, 11, 33, 66, 55 };

		System.out.println("Array - " + Arrays.toString(arr));

		System.out.println("\nEnter Element To Be Searched - ");
		int key = sc.nextInt();

		linearSearch(arr, key);

		sc.close();
	}

	private static int linearSearch(int[] arr, int key) {

		int comp = 0;
		for (int i = 0; i < arr.length; i++) {

			comp++;
			if (arr[i] == key) {
				System.out.println("Number Of Comparisons - " + comp);
				System.out.println("Element Found at index = " + i);
				return i;
			}

		}
		System.out.println("Number Of Comparisons - " + comp);
		System.out.println("Element Not Found ");

		return -1;
	}
}
