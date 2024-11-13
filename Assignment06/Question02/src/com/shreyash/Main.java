package com.shreyash;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Queue priorityQueue = new Queue(5);

		int choice = 0;

		do {

			System.out.println("\n0.EXIT");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");

			System.out.print("\nEnter Your Choice - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Thank You");
				break;

			case 1: {
				if (priorityQueue.isFull()) {
					System.out.println("Queue is Empty Cant Add Elements !");
				} else {
					System.out.print("Enter Element To Push - ");
					int ele = sc.nextInt();
					priorityQueue.push(ele);
				}
			}
				break;

			case 2: {
				if (priorityQueue.isEmpty()) {
					System.out.println("Queue is Empty Cant Delete Elements !");
				} else {
					int pop = priorityQueue.pop();
					System.out.println("\nPopped Element = " + pop);
				}

			}
				break;

			case 3: {
				if (priorityQueue.isEmpty()) {
					System.out.println("Queue is Empty Cant Peek Element !");
				} else {
					int peek = priorityQueue.peek();
					System.out.println("\nMax Element = " + peek);
				}
			}
				break;

			default:
				System.out.println("Invalid Choice ");
				break;
			}
		} while (choice != 0);
		sc.close();

	}
}
