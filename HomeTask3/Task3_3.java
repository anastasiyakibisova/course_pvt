package core;

import java.util.Scanner;

public class Task3_3 {

	public static void main(String[] args) {
		// Возвести число в квадрат, вернуть результат возведения
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number");
		int number = scanner.nextInt();
		System.out.println("Squaring Number = " + squaringNumber(number));
	}

	public static int squaringNumber(int a) {
		return a * a;

	}

}
