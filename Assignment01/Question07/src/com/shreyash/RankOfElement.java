package com.shreyash;

import java.util.Arrays;
import java.util.Scanner;

public class RankOfElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };

		System.out.println("\nArray - " + Arrays.toString(arr));

		System.out.println("\nEnter Element To Find Its Rank - ");
		int ele = sc.nextInt();

		rankOfElement(arr, ele);
	}

	public static int rankOfElement(int[] arr, int ele) {

		int rank = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= ele) {
				rank++;
			}
		}

		System.out.println("Rank Of " + ele + " = " + rank);
		return -1;
	}
}
