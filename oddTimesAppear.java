package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class oddTimesAppear {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };
		List<Integer> numberExport = findOddTimesAppearNum(array);
//		for (int i : numberExport) {
//			System.out.print(i + " ");
		System.out.println(Arrays.toString(numberExport.toArray()));
	}

	public static List<Integer> findOddTimesAppearNum(int[] array) {
		Map<Integer, Integer> timesAppear = new HashMap<>();

//	dem so lan xuat hien cua moi so trong array
		for (int j = 0; j < array.length; j++) {
			if (timesAppear.containsKey(array[j])) {
				timesAppear.put(array[j], timesAppear.get(array[j]) + 1);
			} else {
				timesAppear.put(array[j], 1);
			}
		}

//	tim so ma xuat hien le lan
		List<Integer> oddTimes = new ArrayList<>();
		for (int key : timesAppear.keySet()) {
			if (timesAppear.get(key) % 2 != 0) {
				oddTimes.add(key);
			}
		}
		return oddTimes;
	}
}
