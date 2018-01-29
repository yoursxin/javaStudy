package test.sort;

import java.util.Arrays;

public final class Sort {

	public static <T extends Comparable<? super T>> void insertSort(T[] array) {

		int j;
		for (int i = 1; i < array.length; i++) {
			T tmp = array[i];

			for (j = i; j > 0 && tmp.compareTo(array[j - 1]) < 0; j--) {
				array[j] = array[j - 1];
			}
			array[j] = tmp;
		}

	}

	public static void main(String[] args) {
		Integer[] testArray = { 3, 1, 5, 0, 9, 88, 77 };
		insertSort(testArray);
		System.out.println(Arrays.asList(testArray));
	}

}
