package core;

import java.util.Scanner;

public class Task2_4 {

	public static void main(String[] args) {
		// найти количество нулевых элементов,
		// вывести количество. если нулевых элементов нет - вывести сообщение, что их
		// нет
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи размер массива");
		int n = scanner.nextInt();
		int[] mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = scanner.nextInt();
		}
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				count++;
			}
		}
		if (count != 0) {
			System.out.print("Count zero elements = " + count);
		} else {
			System.out.print("no zero elements!");
		}
	}

}
