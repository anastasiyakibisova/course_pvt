package core;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

public class Workstrings {

	public static int num = 0;

	public static void getString(String[] array, int num) {
		System.out.println(
				" Number string:" + (num + 1) + " String is " + array[num] + "  length is " + array[num].length());
	}

	public static void maxMinString(String[] array) {
		int max = array[0].length();
		for (int i = 1; i < array.length; i++) {
			if (max < array[i].length()) {
				max = array[i].length();
				num = i;
			}
		}
		getString(array, num);
		int min = array[0].length();
		for (int i = 1; i < array.length; i++) {
			if (min > array[i].length()) {
				min = array[i].length();
				num = i;
			}
		}
		getString(array, num);
	}

	public static void printString(String[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

	public static String[] newString(String[] array) {
		String[] mas = new String[array.length];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = array[i];
		}
		return mas;
	}

	public static void increaseString(String[] array) {
		String[] mas = newString(array);
		for (int j = mas.length - 1; j >= 1; j--) {
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i].length() > mas[i + 1].length()) {
					String buf = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = buf;
				}
			}
		}
		printString(mas);
	}

	public static void descendingString(String[] array) {
		String[] mas = newString(array);
		for (int j = mas.length - 1; j >= 1; j--) {
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i].length() < mas[i + 1].length()) {
					String buf = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = buf;
				}
			}
		}
		printString(mas);
	}

	public static int averageLength(String[] array) {
		int count = 0;
		int avL = 0;
		for (int i = 0; i < array.length; i++) {
			avL += array[i].length();
			count++;
		}
		avL = avL / count;
		System.out.println("average length = " + avL);
		return avL;
	}

	public static void moreAverageLength(String[] array) {
		int avL = averageLength(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() > avL) {
				getString(array, i);
			}
		}
	}

	public static void lessAverageLength(String[] array) {
		int avL = averageLength(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i].length() < avL) {
				getString(array, i);
			}
		}
	}

	public static int differentSymbols(String word) {
		char[] wordChars = word.toCharArray();
		int result = 0;
		for (int i = 1; i < wordChars.length; i++) {
			if (wordChars[0] != wordChars[i]) {
				result++;
			}
		}
		return result;
	}

	public static void minDifferentSymbols(String[] array) {
		String result = array[0];
		num = 0;
		for (int i = 1; i < array.length; i++) {
			if (differentSymbols(result) > differentSymbols(array[i])) {
				result = array[i];
				num = i;
			}
		}
		getString(array, num);
	}

	public static void maxDifferentSymbols(String[] array) {
		String result = array[0];
		num = 0;
		for (int i = 1; i < array.length; i++) {
			if (differentSymbols(result) < differentSymbols(array[i])) {
				result = array[i];
				num = i;
			}
		}
		getString(array, num);
	}

	public static List<String> wordLatin(String[] array) {
		Pattern p = Pattern.compile("[a-zA-Z]+");
		List<String> result = new ArrayList<String>();
		for (String word : array) {
			Matcher m = p.matcher(word.toLowerCase());
			if (m.matches()) {
				result.add(word);
			}
		}
		return result;
	}

	public static void equalNumberNowelsConsonants(String[] array) {
		List<String> wordsLatin = wordLatin(array);
		System.out.println("words from latin: " + wordsLatin.size() + ": " + wordsLatin);
		int vowelsCount;
		int consonantsCount;
		for (String word : wordsLatin) {
			vowelsCount = word.replaceAll("[^aeiou]", "").length();
			consonantsCount = word.replaceAll("[aeiou]", "").length();
			if (vowelsCount == consonantsCount) {
				System.out.print(word + "(" + vowelsCount + "," + consonantsCount + "), ");
			}
		}
		System.out.println();
	}

	public static void strictOrderIncreasingCodes(String[] array) {
		num = 0;
		for (String word : array) {
			if (isWordSymbolCodesInAsc(word)) {
				System.out.println(word);
				num++;
				break;
			}
		}
		if (num == 0) {
			System.out.println(
					"the word, the characters in which are in a strict order of increasing their codes are not");
		}
	}

	public static boolean isWordSymbolCodesInAsc(String word) {
		char[] wordChars = word.toCharArray();
		if (wordChars.length < 2) {
			return false;
		}
		boolean result = false;
		for (int i = 0; i < wordChars.length - 1; i++) {
			if ((int) wordChars[i + 1] - (int) wordChars[i] == 1) {
				result = true;
			} else {
				result = false;
			}
		}
		return result;
	}

	public static boolean numberWord(String word) {
		Pattern numericPattern = Pattern.compile("[0-9]+");
		Matcher numericMatcher = numericPattern.matcher(word);
		return numericMatcher.matches();
	}

	public static void wordPalindrome(String[] array) {
		List<String> palindromWords = new ArrayList<String>();
		for (String word : array) {
			if (numberWord(word)) {
				boolean inputPalindrom = word.equals(new StringBuilder(word).reverse().toString());
				if (inputPalindrom) {
					palindromWords.add(word);
				}
			}
		}
		if (palindromWords.size() == 0) {
			System.out.println("No words palindrome");
		}
		if (palindromWords.size() == 1) {
			System.out.println("word Palindrome " + palindromWords.get(0));
		} else {
			System.out.println("word Palindrome " + palindromWords.get(1));
		}
	}

}
