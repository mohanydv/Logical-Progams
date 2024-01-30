package com.mhn.array;

import java.util.Arrays;

public class SmallestAndSecoundSmallest {
	public static void main(String[] args) {

		getSmallestAndSecoundSmallest(new int[] { 0, 2, 4, 5, 2, 4, 8, 73, 1, 12, 32 });
	}

	private static void getSmallestAndSecoundSmallest(int[] num) {
		if (num.length < 2) {
			System.out.println("array length should be atleast 2");
			return;
		}
		int small = Integer.MAX_VALUE;
		int secSmall = Integer.MAX_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (num[i] < small) {
				secSmall = small;
				small = num[i];

			} else if (num[i] < secSmall && num[i] != small) {
				secSmall = num[i];
			}
		}
		System.out.println("given elements are :" + Arrays.toString(num));
		System.out.println("small =:" + small);
		System.out.println("secoundSmall =:" + secSmall);
	}
}
