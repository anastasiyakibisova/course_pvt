package core;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
//		1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
//		2. Ввести n строк с консоли. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
//		3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.
//		4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
//		5. Ввести n слов с консоли. Найти количество слов, содержащих только символы латинского алфавита, а среди них – количество слов с равным числом гласных и согласных букв.
//		6. Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке возрастания их кодов. Если таких слов несколько, найти первое из них.
//		7. Ввести n слов с консоли. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
//		8. Ввести n слов с консоли. Среди слов, состоящих только из цифр, найти слово-палиндром. Если таких слов больше одного, найти второе из них.
		int n = 5;
		Scanner scanner = new Scanner(System.in);
		String[] arrayString = new String[n];
		for (int i = 0; i < arrayString.length; i++) {
			System.out.print("Input string " + (i+1) + ": ");
		    arrayString[i] = scanner.nextLine();
		}
		//String[] arrayString = {"mama", "1221", "abc", "informatica",  "132231"};
		//1
		System.out.println("1");
		Workstrings.maxMinString(arrayString);
		//2
		System.out.println("2");
		Workstrings.increaseString(arrayString);
		Workstrings.descendingString(arrayString);
		//3
		System.out.println("3");
		Workstrings.moreAverageLength(arrayString);
		Workstrings.lessAverageLength(arrayString);
		//4
		System.out.println("4");
		Workstrings.minDifferentSymbols(arrayString);
		//5
		System.out.println("5");
		Workstrings.equalNumberNowelsConsonants(arrayString);
		//6
		System.out.println("6");
		Workstrings.strictOrderIncreasingCodes(arrayString);
		//7
		System.out.println("7");
		Workstrings.maxDifferentSymbols(arrayString);
		//8
		System.out.println("8");
		Workstrings.wordPalindrome(arrayString);
	}

}
