package core;

public class Massiv {

	private int min;
	private int div = 0;
	private int sum = 0;

	public void sumMas(int[] mas, int size) {
		try {
			for (int i = 0; i < size; i++) {
				sum += mas[i];
			}
		} catch (ArrayIndexOutOfBoundsException x) {
			System.out.println("out of bounds array");
		} finally {
			System.out.println("the amount is not counted");
		}
	}

	public void getMas(int[] mas, int size) {
		try {
			for (int i = 0; i < size; i++) {
				System.out.print(mas[i] + " ");
			}
			System.out.println();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("out of bounds array");
		}
	}

	public void divisionByNumber(int[] mas) {
		try {
			for (int i = 0; i <= mas.length; i++) {
				System.out.println(mas[i] / div);
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("out of bounds array");
		} catch (ArithmeticException ex) {
			System.out.println("Division by zero");
		}
	}

	public void minElements(int[] mas) {
		min = mas[0];
		try {
			for (int i = 0; i <= mas.length; i++) {
				if (mas[i] < min) {
					min = mas[i];
				}
			}
			System.out.println(min / div);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException ex) {
			System.out.println("error " + ex.getMessage());
		}
	}

	public void mas(int[] mas) {
		try {
			try {
				for (int i = 0; i <= mas.length; i++) {
					System.out.print(mas[i] + " ");
				}
			} catch (ArithmeticException ex) {
				System.out.println("out of bounds array");
			}
			for (int i = 0; i < mas.length; i++) {
				System.out.println(mas[i] / (mas[i] / mas[i]));
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Division by zero");
		}

	}

}
