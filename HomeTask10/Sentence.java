package core;

public class Sentence extends Word {

	void wordPlitting(String str, int n) {
		char[] wordChars = str.toCharArray();
		strt = "";
		for (int i = 0; i < str.length(); i++) {
			if (String.valueOf(wordChars[i]).compareTo(String.valueOf(' ')) != 0
					&& String.valueOf(wordChars[i]).compareTo(String.valueOf('.')) != 0
					&& String.valueOf(wordChars[i]).compareTo(String.valueOf('!')) != 0
					&& String.valueOf(wordChars[i]).compareTo(String.valueOf('?')) != 0) {
				strt += wordChars[i];
			} else {
				characterReplacement(strt + wordChars[i], n);
				strt = "";
			}
		}

	}
}
