package com.shreyash;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = "My Name is Shreyash my Surname is Ghare";
		String lowerecase = s.toLowerCase();

		String[] words = lowerecase.split(" ");

		countWords(words);
	}

	private static void countWords(String[] arr) {

		boolean[] visited = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				continue;
			}
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println("Count of " + arr[i] + " = " + count);
		}
	}
}
