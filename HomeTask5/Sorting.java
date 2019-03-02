package core;

import java.util.Arrays;

public class Sorting {

	public static void insertionSort(int[] mas) {
		for (int j = 1; j < mas.length; j++) {
			int key = mas[j];
			int i = j - 1;
			while (i >= 0 && mas[i] > key) {
				mas[i + 1] = mas[i];
				i = i - 1;
			}
			mas[i + 1] = key;
		}
		printMas(mas);
	}

	public static void shellSort(int[] mas) {
		int increment = mas.length / 2;
		while (increment >= 1) {
			for (int startIndex = 0; startIndex < increment; startIndex++) {
				insertionSort(mas, startIndex, increment);
			}
			increment = increment / 2;
		}
		printMas(mas);
	}

	public static void insertionSort(int[] arr, int startIndex, int increment) {
		for (int i = startIndex; i < arr.length - 1; i = i + increment) {
			for (int j = Math.min(i + increment, arr.length - 1); j - increment >= 0; j = j - increment) {
				if (arr[j - increment] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j - increment];
					arr[j - increment] = tmp;
				} else {
					break;
				}
			}
		}
	}

	public static void mergeSort(int[] mas, int a, int b) {
		if (b <= a)
			return;
		int mid = a + (b - a) / 2;
		mergeSort(mas, a, mid);
		mergeSort(mas, mid + 1, b);
		int[] buf = Arrays.copyOf(mas, mas.length);
		for (int k = a; k <= b; k++) {
			buf[k] = mas[k];
		}
		int i = a, j = mid + 1;
		for (int k = a; k <= b; k++) {
			if (i > mid) {
				mas[k] = buf[j];
				j++;
			} else if (j > b) {
				mas[k] = buf[i];
				i++;
			} else if (buf[j] < buf[i]) {
				mas[k] = buf[j];
				j++;
			} else {
				mas[k] = buf[i];
				i++;
			}
		}
	}

	public static void printMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}
}
