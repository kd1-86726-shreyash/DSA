package com.shreyash;

import java.util.Arrays;

public class ReverseStack {

	int top;
	int arr[];
	private final int SIZE;

	public ReverseStack(int SIZE) {
		this.SIZE = SIZE;
		arr = new int[SIZE];
		this.top = -1;
	}

	public void pushReverse(int ele) {
		arr[++top] = ele;
	}

	public void displayReverse() {
		System.out.println("Array = " + Arrays.toString(arr));
	}
}
