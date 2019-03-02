package core;

import java.util.Scanner;

public class Task2_8 {

	public static void main(String[] args) {
		// найти минимальный-максимальный элементы и вывести
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
		int min = mas[0];
		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		System.out.println("maximum element = " + max);
		System.out.println("minimum element = " + min);
	}

}
