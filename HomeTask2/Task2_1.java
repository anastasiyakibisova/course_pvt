package core;

import java.util.Scanner;

public class Task2_1 {

	public static void main(String[] args) {
		//пройти по массиву, вывести все элементы в прямом и в обратном порядке.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введи размер массива");
		int n = scanner.nextInt();
		int[] mas = new int [n];
		for(int i = 0; i < mas.length; i++){
			mas[i]=10 + (int)(Math.random() * (50-10));
		}
		for(int i = 0; i < mas.length; i++){
			System.out.print(mas[i] + " ");
		}
		System.out.println();
		for(int i = mas.length-1; i >= 0; i--){
			System.out.print(mas[i] + " ");
		}
	}

}
