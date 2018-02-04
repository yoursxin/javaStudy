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

	public static <T extends Comparable<? super T>> void shellSort(T[] array) {
		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			int j;
			for (int i = gap; i < array.length; i += gap) {
				T tmp = array[i];
				for (j = i; j > 0 && tmp.compareTo(array[j - gap]) < 0; j -= gap) {
					array[j] = array[j - gap];
				}
				array[j] = tmp;
			}
		}
	}

	private static <T extends Comparable<? super T>> void merge(T[] a, T[] aux, int low, int mid, int high) {

		int j = low;
		int k = mid + 1;

		for (int i = low; i <= high; i++) {
			if (k > high) {
				aux[i] = a[j++];
			} else if (j > mid) {
				aux[i] = a[k++];
			} else if (a[j].compareTo(a[k]) < 0) {
				aux[i] = a[j++];
			} else {
				aux[i] = a[k++];
			}
		}
		// copy
		for (int i = low; i <= high; i++) {
			a[i] = aux[i];
		}

	}

	// from top to bottom
	public static <T extends Comparable<? super T>> void mergeSort(T[] a) {

		T[] aux = (T[]) new Comparable[a.length];
		mergeSort(a, aux, 0, a.length - 1);

	}

	private static <T extends Comparable<? super T>> void mergeSort(T[] a, T[] aux, int low, int high) {
		if (low >= high)
			return;
		int mid = (high + low) / 2;
		mergeSort(a, aux, low, mid);
		mergeSort(a, aux, mid + 1, high);
		merge(a, aux, low, mid, high);

	}

	
	// from bottom to top
	public static <T extends Comparable<? super T>> void mergeSortBTT(T[] a) {
		T[] aux = (T[]) new Comparable[a.length];
		int N = a.length;
		for (int i = 1; i < N; i += i) {
			for (int j = 0; j < N -i; j += 2 * i) {
				System.out.println(j + ":"+(j+i-1)+":" + Math.min(j + 2 * i - 1, N - 1));
				merge(a, aux, j,j+i-1, Math.min(j + 2 * i - 1, N - 1));
				System.out.println(Arrays.toString(a));
			}
		}

	}

	public static void main(String[] args) {
		Integer[] testArray = { 3, 1, 5, 0, 9, 88, 77, 15, 29 };
		System.out.println(Arrays.toString(testArray));
		mergeSortBTT(testArray);
	}

}
