package com.shreyash;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int arr[] = { 0, 44, 99, 77, 33, 55, 22, 88, 11, 66 };
		MinHeapSort heap = new MinHeapSort();

		System.out.println("\nARRAY Before Sorting - " + Arrays.toString(arr));

		heap.MinHeap(arr);

		System.out.println("\nARRAY After Sorting - " + Arrays.toString(arr));
	}
}
