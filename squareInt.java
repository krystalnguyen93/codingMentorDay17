package day17;

import java.util.Scanner;

public class squareInt {
	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		System.out.println("Input number of test cases: ");
		int q = inputData.nextInt();
		for (int i = 0; i < q; i++) {
			System.out.println("Input the starting integer: ");
			int a = inputData.nextInt();
			System.out.println("Input the ending integer: ");
			int b = inputData.nextInt();
			System.out.println("The number of square integers is: " + countSquareInt(a, b));
			System.out.println("--------");
		}
		inputData.close();
	}

	public static int countSquareInt(int a, int b) {
		int count = 0;
		for (int j = (int) Math.sqrt(a); j <= (int) Math.sqrt(b); j++) {
			if (j * j >= a && j * j <= b) {
				count++;
			}
		}
		return count;
	}
}