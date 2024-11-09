package com.shreyash;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchComparisons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 11, 22, 33, 44, 55, 66 };

		System.out.println("Array - " + Arrays.toString(arr));

		System.out.println("\nEnter Element To Be Searched - ");
		int key = sc.nextInt();

		binarySearch(arr, key);

		sc.close();
	}

	public static int binarySearch(int[] arr, int key) {

		int left = 0;
		int right = arr.length - 1;
		int comp = 0;

		while (left <= right) {
			int mid = (left + right) / 2;

			comp++;
			if (key == arr[mid]) {
				System.out.println("Comparisons - " + comp);
				System.out.println("Element Found At Index - " + mid);
				return mid;
			} else if (key < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}

		System.out.println("Comparisons - " + comp);
		System.out.println("Element Not Found ");
		return -1;

	}

}
