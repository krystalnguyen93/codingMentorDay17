package day17;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class candles {
	public static void main(String[] args) {
		Scanner inputData = new Scanner(System.in);
		System.out.println("Input the number of candles: ");
		int n = inputData.nextInt();

		List<Integer> candles = new ArrayList<>();
		System.out.println("Input the candle height: ");
		for (int i = 0; i < n; i++) {
			candles.add(inputData.nextInt());
		}
		inputData.close();
		System.out.println("the number of candles that are tallest: " + birthdayCakeCandles(candles));
	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		int maxHeight = candles.get(0);
		int countCandle = 1;

		for (int i = 1; i < candles.size(); i++) {
			if (candles.get(i) > maxHeight) {
				maxHeight = candles.get(i);
				countCandle = 1;
			} else if (candles.get(i) == maxHeight) {
				countCandle++;
			}
		}
		return countCandle;
	}
}
