package com.shreyash;

import java.util.Arrays;

public class LinearQueue {

	int arr[];
	private final int SIZE;
	int front, rear;

	public LinearQueue(int SIZE) {
		this.SIZE = SIZE;
		arr = new int[SIZE];
		this.front = this.rear = 0;
	}

	public boolean isEmpty() {
		return front == rear;
	}

	public boolean isFull() {
		return rear == SIZE;
	}

	public void push(int ele) {
		arr[rear] = ele;
		rear++;
	}

	public int pop() {
		int temp = arr[front];
		front++;
		return temp;
	}

	public int peek() {
		return arr[front];
	}

	public void display() {
		System.out.println("\nQueue = " + Arrays.toString(arr));
	}

}
