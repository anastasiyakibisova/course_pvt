package core;

import java.util.Scanner;

public class Additional_task {

	public static void main(String[] args) {
		// пройти по массиву, вывести все элементы в прямом и в обратном порядке.
		int size = inputSizeMas();
		int[] mas = new int[size];
		mas = inputRandomMas(size);
		getMas(mas);
		getReverseMas(mas);
		// найти произведения всех элементов массива, вывести
		System.out.println("Multiply = " + Myltiply(mas));
		// каждый 3-й элемент умножить на 2
		multiplyByNumber(mas);
		getMas(mas);
		// найти количество нулевых элементов,вывести количество.
		// если нулевых элементов нет - вывести сообщение, что их нет
		int count = zeroElements(mas);
		// найти и вывести номер нулевых элементов. если нулевых элементов нет - вывести
		// сообщение, что их нет
		getNumberZeroElements(mas, count);
		// пройти по массиву и поменять местами каждые 2 соседних элемента
		swapElements(mas);
		// пройти по массиву и поменять местами первый и последний, второй и
		// предпоследний и т.д.
		swapNextElements(mas);
		// найти минимальный-максимальный элементы и вывести
		System.out.println("maximum element = " + maxElements(mas));
		System.out.println("minimum element = " + minElements(mas));
		// найти номер минимального-максимального элементов и вывести
		System.out.println("number maximum element = " + namberMaxElement(mas));
		System.out.println("number minimum element = " + namberMinElement(mas));
		// проверить, является ли массив возрастающей последовательностью (каждое
		// следующее число больше предыдущего)
		increasingSequence(mas);
		// заменить все элементы массива на полусумму соседних элементов
		swapHalfSum(mas);
		// циклически сдвинуть все элементы вправо на 2 позиции (1-й элемент станет 3-м,
		// 2-й стaнeт 4-м и т.д.)
		cyclicShift(mas);
	}

	public static int inputSizeMas() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input size array");
		int n = scanner.nextInt();
		return n;
	}

	public static int[] inputRandomMas(int size) {
		int[] mas = new int[size];
		int underInterval = 0;
		int topInterval = 5;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = underInterval + (int) (Math.random() * (topInterval - underInterval));
		}
		return mas;
	}

	public static void getMas(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

	public static void getMasFloat(float[] mas) {
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

	public static void getReverseMas(int[] mas) {
		for (int i = mas.length - 1; i >= 0; i--) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

	public static int Myltiply(int[] mas) {
		int multiply = 1;
		for (int i = 0; i < mas.length; i++) {
			multiply = multiply * mas[i];
		}
		return multiply;
	}

	public static int[] duplicationMas(int[] mas) {
		int[] array = new int[mas.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = mas[i];
		}
		return array;
	}

	public static float[] duplicationMasFloat(int[] mas) {
		float[] array = new float[mas.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = mas[i];
		}
		return array;
	}

	public static void multiplyByNumber(int[] mas) {
		int[] array = duplicationMas(mas);
		int number = 2;
		int thirdElement = 3;
		for (int i = 0; i < array.length; i++) {
			if (i % thirdElement == 0 && i != 0) {
				array[i - 1] = array[i - 1] * number;
			} else {
				array[i] = mas[i];
			}
		}
		getMas(array);
	}

	public static int zeroElements(int[] mas) {
		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				count++;
			}
		}
		if (count != 0) {
			System.out.println("Count zero elements = " + count);
		} else {
			getNoZeroElements();
		}
		return count;
	}

	public static void getNoZeroElements() {
		System.out.println("no zero elements!");
	}

	public static void getNumberZeroElements(int[] mas, int count) {
		if (count == 0) {
			getNoZeroElements();
		} else {
			for (int i = 0; i < mas.length; i++) {
				if (mas[i] == 0) {
					System.out.println("number zero elements! " + (i + 1));
				}
			}
		}
	}

	public static void swapElements(int[] mas) {
		int[] array = duplicationMas(mas);
		int box;
		for (int i = 0; i < array.length - 1; i++) {
			box = array[i];
			array[i] = array[i + 1];
			array[i + 1] = box;
		}
		getMas(array);
	}

	public static void swapNextElements(int[] mas) {
		int[] array = duplicationMas(mas);
		int i = 0;
		while (i <= array.length / 2) {
			for (int j = array.length - 1; j >= array.length / 2; j--) {
				int box = array[i];
				array[i] = array[j];
				array[j] = box;
				i++;
			}
		}
		getMas(array);
	}

	public static int minElements(int[] mas) {
		int min = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min) {
				min = mas[i];
			}
		}
		return min;
	}

	public static int maxElements(int[] mas) {
		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				max = mas[i];
			}
		}
		return max;
	}

	public static int namberMaxElement(int[] mas) {
		int number = 0;
		int max = mas[number];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > max) {
				number = i;
			}
		}
		return number;
	}

	public static int namberMinElement(int[] mas) {
		int number = 0;
		int min = mas[number];
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < min) {
				number = i;
			}
		}
		return number;
	}

	public static void increasingSequence(int[] mas) {
		int count = 0;
		for (int i = 0; i < mas.length - 1; i++) {
			if (mas[i] > mas[i + 1]) {
				count++;
			}
		}
		if (count == 0) {
			System.out.print("array of increasing sequence ");
		} else {
			System.out.print("array of not increasing sequence ");
		}
	}

	public static void swapHalfSum(int[] mas) {
		float[] array = duplicationMasFloat(mas);
		for (int i = 0; i < array.length; i++) {
			if (i == 0 || i == array.length - 1) {
				array[i] = mas[i];
			} else {
				array[i] = (float) (mas[i - 1] + mas[i + 1]) / 2;
			}
		}
		getMasFloat(array);
	}

	public static void cyclicShift(int[] mas) {
		int[] array = duplicationMas(mas);
		int box = array[array.length - 1];
		int box1 = array[array.length - 2];
		for (int i = array.length - 1; i > 1; i--) {
			array[i] = array[i - 2];
		}
		array[0] = box1;
		array[1] = box;
		getMas(array);
	}
}
