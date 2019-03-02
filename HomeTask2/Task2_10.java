package core;

import java.util.Scanner;

public class Task2_10 {

	public static void main(String[] args) {
		// проверить, является ли массив возрастающей последовательностью (каждое
		// следующее число больше предыдущего)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи размер массива");
		int n = scanner.nextInt();
		int[] mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = scanner.nextInt();
		}
		int count = 0;
		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] > mas[i + 1]) {
				count++;
			}
		}
		if (count == 0) {
			System.out.print("array of increasing sequence ");
		} else {
			System.out.print("array of not increasing sequence ");
		}
	}

}
