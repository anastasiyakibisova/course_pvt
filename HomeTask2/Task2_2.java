package core;

import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args) {
		// найти произведения всех элементов массива, вывести
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи размер массива");
		int n = scanner.nextInt();
		int[] mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = 1 + (int) (Math.random() * (5 - 1));
		}
		int proizv = 1;
		for (int i = 0; i < mas.length; i++) {
			proizv = proizv * mas[i];
		}
		System.out.print("Multiply = " + proizv);

	}

}
