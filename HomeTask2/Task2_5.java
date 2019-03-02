package core;

import java.util.Scanner;

public class Task2_5 {

	public static void main(String[] args) {
		// найти и вывести номер нулевых элементов. если нулевых элементов нет - вывести
		// сообщение, что их нет
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
				System.out.println("number zero elements! " + (i+1));
			}
		}
		if (count == 0) {
			System.out.print("no zero elements!");
		}

	}

}
