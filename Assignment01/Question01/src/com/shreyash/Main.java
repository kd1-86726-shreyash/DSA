package com.shreyash;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = { 11, 55, 44, 22, 11, 33, 88, 66, 55 };

		System.out.println("Array = " + Arrays.toString(arr));
		System.out.println("Enter Key To Search - ");
		int key = sc.nextInt();


		int index = linearSearch(arr, key);
		if (index != -1) {
			System.out.println("Last Occurence of Element Found At Index - " + index);
		} else {
			System.out.println("Element Not Found ");
		}
	}

	public static int linearSearch(int[] arr, int key) {

		for (int i = arr.length - 1; i > 0; i--) {
			if (arr[i] == key)
				return i;
		}
		return -1;
	}
}
