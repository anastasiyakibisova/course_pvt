package core;

import java.util.Scanner;

public class Task3_2 {

	public static void main(String[] args) {
		// Проверить четное число или нечетное, вернуть boolean результат
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number");
		int number = scanner.nextInt();
		if (parityNumber(number)) {
			System.out.println("even number");
		} else {
			System.out.println("not even number");
		}
	}

	public static boolean parityNumber(int a) {
		return a % 2 == 0? true: false;
		}

	}

}
