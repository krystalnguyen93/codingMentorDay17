package day17;

import java.util.ArrayList;
import java.util.List;

public class minGap {
	public static void main(String[] args) {
		int[] array = { 7, 1, 8, 6, 1, 8, 8, 4 };
		System.out.println(minDistance(array));
	}

	public static int minDistance(int[] arr) {
		int minGap = arr.length;
		List<Integer> newArray = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			if (newArray.contains(arr[i])) {
				int gap = i - newArray.lastIndexOf(arr[i]);
				minGap = Math.min(minGap, gap);
			}
			newArray.add(arr[i]);
		}
		return minGap;
	}
}