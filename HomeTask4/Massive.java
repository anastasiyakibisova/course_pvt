package core;

public class Massive {

	public void printMassiveAsLine(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void printReverseMassiveAsLine(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public int getSumOfElements(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public int[] multiptyBy3(int[] array) {
		int multiply = 3;
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * multiply;
		}
		return array;
	}
}
