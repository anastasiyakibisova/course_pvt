package core;

import java.util.Scanner;

public class Task2_3 {

	public static void main(String[] args) {
		// каждый 3-й элемент умножить на 2 (2-мя способами)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи размер массива");
		int n = scanner.nextInt();
		int[] mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = 1 + (int) (Math.random() * (5 - 1));
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		// 1 way
		for (int i = 0; i < mas.length; i++) {
			if (i % 3 == 0 && i != 0) {
				mas[i - 1] = mas[i - 1] * 2;
			}
		}
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		// 2 way
		System.out.println();
		int k = 2;
		while (k < mas.length) {
			mas[k] *= 2;
			k += 3;
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
	}

}
