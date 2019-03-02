package core;

import java.util.Scanner;

public class Additional_task1 {

	public static void main(String[] args) {
		// По аналогии создать двумерный массив, заполнить его случайными числами или
		// вручную. для этого массива:
		// вывести все элементы в прямом и обратном порядке
		// найти минимальный и максимальный элементы
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи размер двумерного массива");
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[][] mas = new int[n][m];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas.length; j++) {
				mas[i][j] = 10 + (int) (Math.random() * (50 - 10));
			}
		}
		// print
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		// reverse print
		for (int i = mas.length - 1; i >= 0; i--) {
			for (int j = mas[i].length - 1; j >= 0; j--) {
				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
		int max = mas[0][0];
		int min = mas[0][0];
		for (int i = mas.length - 1; i >= 0; i--) {
			for (int j = mas[i].length - 1; j >= 0; j--) {
				if (mas[i][j] < min) {
					min = mas[i][j];
				}
				if (mas[i][j] > max) {
					max = mas[i][j];
				}
			}
		}
		System.out.println("maximum element = " + max);
		System.out.println("minimum element = " + min);
	}
}
