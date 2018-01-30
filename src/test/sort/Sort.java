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
	
	public static <T extends Comparable<? super T>> void shellSort(T[] array){
		for(int gap=array.length/2;gap>0;gap/=2){
			int j;
			for(int i=gap; i<array.length;i+=gap){
				T tmp = array[i];
				for(j=i; j>0 && tmp.compareTo(array[j-gap])<0;j-=gap){
					array[j] = array[j-gap];
				}
				array[j]=tmp;
			}
		}
	}

	public static void main(String[] args) {
		Integer[] testArray = { 3, 1, 5, 0, 9, 88, 77 };
		shellSort(testArray);
		System.out.println(Arrays.asList(testArray));
	}

}
