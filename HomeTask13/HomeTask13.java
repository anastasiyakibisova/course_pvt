package core;

import java.io.FileReader;
import java.io.IOException;

public class HomeTask13 {

	public static void main(String[] args) {

		Massiv massive = new Massiv();
		int[] array = { 1, 0, 10, -5 };
		massive.sumMas(array, 5);
		massive.getMas(array, 5);
		massive.divisionByNumber(array);
		massive.minElements(array);
		massive.mas(array);
		try (FileReader fr = new FileReader("file.txt")) {
			char[] mas = new char[9];
			fr.read(mas);
			for (char c : mas)
				System.out.print(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
