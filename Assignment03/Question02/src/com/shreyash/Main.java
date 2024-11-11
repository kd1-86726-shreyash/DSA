package com.shreyash;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		System.out.print("\nEnter Size of the Queue - ");
		int size = sc.nextInt();

		CircularQueueUsingCount cq = new CircularQueueUsingCount(size);
		do {

			System.out.println("\n0.EXIT");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.PEEK");

			System.out.print("\nEnter Your Choice - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("Thank You");
			}
				break;

			case 1: {
				if (cq.isFull()) {
					System.out.println("Queue if Full Cant Add Element !");
				} else {
					System.out.print("\nEnter Element To Push - ");
					int ele = sc.nextInt();
					cq.push(ele);
				}
			}
				break;

			case 2: {

				if (cq.isEmpty()) {
					System.out.println("Queue if Empty Cant Delete Element !");
				} else {
					int pop = cq.pop();
					System.out.println("Popped Element = " + pop);
				}
			}
				break;
			case 3: {
				if (cq.isEmpty()) {
					System.out.println("Queue if Empty Cant Peek Element !");
				} else {
					int peek = cq.peek();
					System.out.println("PEEKED Element = " + peek);
				}

			}
				break;

			case 4: {
				cq.display();

			}
				break;

			default:
				break;
			}
		} while (choice != 0);

		sc.close();
	}
}
