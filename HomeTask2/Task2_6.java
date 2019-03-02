package core;

import java.util.Scanner;

public class Task2_6 {

	public static void main(String[] args) {
		// пройти по массиву и поменять местами каждые 2 соседних элемента
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи размер массива");
		int n = scanner.nextInt();
		int[] mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = 50 + (int) (Math.random() * (100 - 50));
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		int box;
		for (int i = 0; i < mas.length - 1; i++) {
			box = mas[i];
			mas[i] = mas[i + 1];
			mas[i + 1] = box;
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}

	}

}
