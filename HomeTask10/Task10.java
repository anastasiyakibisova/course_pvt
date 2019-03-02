package core;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		System.out.println("Input text");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		System.out.println("Input number char");
		int n = scanner.nextInt();
		Paragraph paragraph = new Paragraph();
		paragraph.sentencePlitting(text, n);
	}

}
