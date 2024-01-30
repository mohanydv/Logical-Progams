package com.mhn.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MergeSortedAndUnsortedIntoSortedArrayRemoveDuplicate {
	public static void main(String[] args) {
		int[] array1 = new int[] { 3, 2, 1, 24, 2, 1, 44, 55 };
		int[] array2 = new int[] { 2, 53, 3, 2, 5, 2, 4, 43, 32 };

		int[] mergedArray = getMergeSortedAndUnsortedIntoSortedArrayRemoveDuplicate(array1, array2);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(mergedArray));
	}

	private static int[] getMergeSortedAndUnsortedIntoSortedArrayRemoveDuplicate(int[] array1, int[] array2) {
		int[] mergedArry = new int[array1.length + array2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < array1.length) {
			mergedArry[k] = array1[i];
			i++;
			k++;
		}
		while (j < array2.length) {
			mergedArry[k] = array2[j];
			j++;
			k++;

		}

		Set<Integer> noDuplicat = new HashSet<>();

		for (int m = 0; m < mergedArry.length; m++) {
			noDuplicat.add(mergedArry[m]);
		}

		Iterator<Integer> it = noDuplicat.iterator();
		int[] mergedListWithNoDuplicate = new int[noDuplicat.size()];
		int n = 0;
		while (it.hasNext()) {
			mergedListWithNoDuplicate[n] = it.next();
			n++;
		}

		Arrays.sort(mergedListWithNoDuplicate);
		return mergedListWithNoDuplicate;
	}

}
