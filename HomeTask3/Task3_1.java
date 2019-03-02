package core;

import java.util.Scanner;

public class Task3_1 {

	public static void main(String[] args) {
		// Найти минимальное число из 2 чисел, вернуть минимальное
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		System.out.println(minNumber(number1, number2));
	}

	public static int minNumber(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}

	}

}
