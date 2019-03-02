package core;

import java.util.Scanner;

public class Additional_task {

	public static void main(String[] args) {
		int n = 5;
		char[][] array = new char[n][n];
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input string ");
		String arrayString = scanner.nextLine();
		char[] chars = arrayString.toCharArray();
		//1
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (k < arrayString.length()) {
					array[i][j] = chars[k];
					k++;
				} else {
					array[i][j] = '0';
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		//2
		k = 0;
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < n; j++) {
				if (k < arrayString.length()) {
					array[j][i] = chars[k];
					k++;
				} else {
					array[i][j] = '0';
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
