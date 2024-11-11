package com.shreyash;

import java.util.Arrays;

public class Stack {

	int top;
	int arr[];
	private final int SIZE;

	public Stack(int SIZE) {
		this.SIZE = SIZE;
		arr = new int[SIZE];
		this.top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}

	public void push(int ele) {
		arr[++top] = ele;
	}

	public int pop() {
		return arr[top--];
	}

	public void display() {
		System.out.println("Array = " + Arrays.toString(arr));
	}
}
