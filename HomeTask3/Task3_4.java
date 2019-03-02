package core;

import java.util.Scanner;

public class Task3_4 {

	public static void main(String[] args) {
		// Возвести число в куб, вернуть результат возведения
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number");
		int number = scanner.nextInt();
		System.out.println("Cube Number = " + cubNumber(number));
	}

	public static int cubNumber(int a) {
		return a * a * a;
	}

}
