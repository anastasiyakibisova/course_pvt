package core;

public class Arrays {

	private int number;
	private int[] mas1;

	public int[] multiplyByNumber(int[] mas, int number) {
		mas1 = new int[mas.length];
		for (int i = 0; i < mas.length; i++) {
			mas1[i] = mas[i] * number;
		}
		return mas1;
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
		number = 0;
		int max = mas[number];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				number = i;
			}
		}
		return number;
	}

	public int namberMinElement(int[] mas) {
		number = 0;
		int min = mas[number];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min) {
				number = i;
			}
		}
		return number;
	}

	public double divideByNumber(int[] mas, int num, int number) {
		return mas[num] / number;
	}

	public int[] swapNextElements(int[] array) {
		int i = 0;
		while (i <= array.length / 2) {
			for (int j = array.length - 1; j >= array.length / 2; j--) {
				int box = array[i];
				array[i] = array[j];
				array[j] = box;
				i++;
			}
		}
		return array;
	}

	public double divideByNumber1(int[] mas, int num, int number) {
		try {
			return mas[num] / number;
		} catch (ArithmeticException ex) {
			return 0;
		}
	}

	public int sumElements(int[] mas) {
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			sum += mas[i];
		}
		return sum;
	}

	public double averageMas(int[] mas) {
		return (double) this.sumElements(mas) / mas.length;
	}
}
