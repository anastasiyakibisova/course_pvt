package core;

import java.util.Scanner;

public class Task2_7 {

	public static void main(String[] args) {
		// пройти по массиву и поменять местами первый и последний, второй и
		// предпоследний и т.д.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи размер массива");
		int n = scanner.nextInt();
		int[] mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = 10 + (int) (Math.random() * (50 - 10));
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		int i = 0;
		while (i <= mas.length / 2) {
			for (int j = mas.length - 1; j >= mas.length / 2; j--) {
				int box = mas[i];
				mas[i] = mas[j];
				mas[j] = box;
				i++;
			}
		}
		for (i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

}
