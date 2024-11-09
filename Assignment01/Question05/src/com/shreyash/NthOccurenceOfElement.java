package com.shreyash;

import java.util.Scanner;

public class NthOccurenceOfElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = { 4, 2, 4, 5, 4, 7, 4, 8 };
		System.out.print("Enter Element - ");
		int ele = sc.nextInt();
		System.out.print("Enter Occurrence Of Ele - ");
		int occurence = sc.nextInt();

		int index = findNthOccurrence(arr, ele, occurence);
		if (index != -1) {
			System.out.println(occurence + "th occurrence of element " + ele + " found at index - " + index);
		} else {
			System.out.println(occurence + "th occurrence of element " + ele + " not found");
		}
	}

	public static int findNthOccurrence(int[] arr, int element, int occur) {
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				count++;
				if (count == occur) {
					return i;
				}
			}
		}
		return -1;
	}
}
