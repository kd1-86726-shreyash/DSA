package com.shreyash;

import java.util.Scanner;

public class LinearQueueImpl {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		System.out.print("Enter Size Of The Queue -");
		int size = sc.nextInt();
		LinearQueue lq = new LinearQueue(size);

		do {
			System.out.println("\n0.EXIT");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");
			System.out.println("4.DISPLAY QUEUE");

			System.out.print("\nEnter Your Choice - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("Thank You !");
			}
				break;

			case 1: {
				if (lq.isFull()) {
					System.out.println("Queue is Full Cant Add Element");
				} else {
					System.out.println("Enter Element to push - ");
					int ele = sc.nextInt();
					lq.push(ele);
				}
			}
				break;

			case 2: {
				if (lq.isEmpty()) {
					System.out.println("Queue is Empty Cant Delete Element");
				} else {
					int pop = lq.pop();
					System.out.println("Popped Element = " + pop);
				}

			}
				break;

			case 3: {
				if (lq.isEmpty()) {
					System.out.println("Queue is Empty Cant Peek Element");
				} else {
					int peek = lq.peek();
					System.out.println("Peeked Element = " + peek);
				}

			}
				break;

			case 4: {
				lq.display();

			}
				break;

			default:
				break;
			}
		} while (choice != 0);

		sc.close();
	}
}
