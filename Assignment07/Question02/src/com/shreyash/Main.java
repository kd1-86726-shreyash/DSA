package com.shreyash;

public class Main {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 7, 3, 9, 6, 4, 8, 2, 7, 4, 1, 5, 2 };

		highestOccurence(arr);

	}

	public static void highestOccurence(int[] arr) {

		int maxCount = 0;
		int ele = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (arr[i] == arr[j])
					count++;
			}
			if (count > maxCount)
				maxCount = count;
			ele = arr[i];
		}

		System.out.println("Element with highest occurence = " + ele);
		System.out.println("MaxCount = " + maxCount);

	}
}
