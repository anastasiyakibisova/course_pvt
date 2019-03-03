package core;

public class Array {

	private int number;
	private int[] mas;

	public int[] multiplyByNumber(int[] mas, int number) {
		number = 2;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = mas[i] * number;
		}
		return mas;
	}

	public int maxElements(int[] mas) {
		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		return max;
	}

	public int minElements(int[] mas) {
		int min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		return min;
	}

	public int namberMaxElement(int[] mas) {
		int num = 0;
		int max = mas[num];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				num = i;
			}
		}
		return num;
	}

	public double divideByNumber(int[] mas, int num, int number) {
		return mas[num] / number;
	}

}
