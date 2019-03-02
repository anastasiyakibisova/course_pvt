package core;

public class Word {
	static String strt;

	void characterReplacement(String str, int n) {
		char[] wordChars = str.toCharArray();
		if (str.length() > n) {
			wordChars[n - 1] = '%';
		}
		for (int i = 0; i < str.length(); i++) {
			if (String.valueOf(wordChars[i]).compareTo(String.valueOf('.')) != 0
					&& String.valueOf(wordChars[i]).compareTo(String.valueOf('!')) != 0
					&& String.valueOf(wordChars[i]).compareTo(String.valueOf('?')) != 0) {
				System.out.print(wordChars[i]);
			} else {
				System.out.print(wordChars[i] + " ");
			}
		}

	}
}
