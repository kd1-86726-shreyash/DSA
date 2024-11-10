package com.shreyash;

import java.util.Arrays;

public class InsertionSortDescending {

	public static void main(String[] args) {

		int arr[] = { 22, 55, 11, 77, 44, 66, 33 };

		System.out.println("\nArray Before Sorting - " + Arrays.toString(arr));

		descendingInsertionSort(arr, arr.length);

		System.out.println("\nArray After Sorting in Descending Order - " + Arrays.toString(arr));
	}

	public static void descendingInsertionSort(int[] arr, int length) {

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j;
			for (j = i - 1; j >= 0 && arr[j] < temp; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}

	}
}
