package core;

import java.util.Scanner;

public class Task2_12 {

	public static void main(String[] args) {
		// циклически сдвинуть все элементы вправо на 2 позиции (1-й элемент станет 3-м,
		// 2-й стaнeт 4-м и т.д.)
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
		int box = mas[mas.length - 1];
		int box1 = mas[mas.length - 2];
		for (int i = mas.length - 1; i > 1; i--) {
			mas[i] = mas[i - 2];
		}
		mas[0] = box1;
		mas[1] = box;
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

}
