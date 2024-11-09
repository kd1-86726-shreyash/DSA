package com.shreyash;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };

		int ele = firstNonRepeatingElement(arr);
		if (ele != -1) {
			System.out.println("\nFirst Non Repeating Element = " + ele);
		} else {
			System.out.println("\nNonRepeating Element Not Found");
		}
	}

	public static int firstNonRepeatingElement(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j])
					count++;

			}
			if (count == 1)
				return arr[i];

		}
		return -1;
	}
}
