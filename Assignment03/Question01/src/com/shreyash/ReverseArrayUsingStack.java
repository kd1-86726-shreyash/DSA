package com.shreyash;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayUsingStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int choice = 0;

		System.out.print("\nEnter Soze of Array - ");
		int size = sc.nextInt();

		Stack stk = new Stack(size);
		ReverseStack rstk = new ReverseStack(size);

		do {

			System.out.println("\n)EXIT");
			System.out.println("1.PUSH");
			System.out.println("2.POP");

			System.out.print("\n Enter Your Choiv=ce - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println("Thank You");
			}
				break;

			case 1: {
				if (stk.isFull()) {
					System.out.println("Array Is Full Cant Add Elements ");
				} else {
					System.out.print("Enter Element To Push - ");
					int ele = sc.nextInt();
					stk.push(ele);
				}
			}
				break;

			case 2: {
				if (stk.isEmpty()) {
					System.out.println("Array Is Empty Cant Delete Element - ");
				} else {
					int popedElement = stk.pop();
					System.out.println("Popped Element = " + popedElement);
					rstk.pushReverse(popedElement);
				}

			}
				break;

			default:
				break;
			}
		} while (choice != 0);

		stk.display();
		rstk.displayReverse();
		sc.close();
	}
}
