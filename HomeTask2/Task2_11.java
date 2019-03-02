package core;

import java.util.Scanner;

public class Task2_11 {

	public static void main(String[] args) {
		// заменить все элементы массива на полусумму соседних элементов
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи размер массива");
		int n = scanner.nextInt();
		int[] mas = new int[n];
		float[] mas1 = new float[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = 10 + (int) (Math.random() * (50 - 10));
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			if (i == 0 || i == mas.length - 1) {
				mas1[i] = mas[i];
			} else {
				mas1[i] = (float)(mas[i - 1] + mas[i + 1]) / 2;
			}
		}
		for (int i = 0; i < mas1.length; i++) {
			System.out.print(mas1[i] + " ");
		}
		System.out.println();
	}

}
