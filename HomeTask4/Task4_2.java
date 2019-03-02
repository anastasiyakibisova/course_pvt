package core;

public class Task4_2 {

	public static void main(String[] args) {
		// Создать массив array с данными
		int size = 10;
		int underInterval = 1;
		int topInterval = 5;
		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = underInterval + (int) (Math.random() * (topInterval - underInterval));
		}
		// Создать объект класса Massive
		Massive massive = new Massive();
		// Используя методы класса Massive вывести созданный выше array в прямом и
		// обратном порядке
		massive.printMassiveAsLine(array);
		massive.printReverseMassiveAsLine(array);
		// Используя методы класса Massive вывести сумму элементов array
		System.out.println(massive.getSumOfElements(array));
		// Используя методы класса Massive умножить созданный array на 3
		massive.multiptyBy3(array);
		// Используя методы класса Massive вывести полученный после умножения array в
		// прямом и обратном порядке
		massive.printMassiveAsLine(array);
		massive.printReverseMassiveAsLine(array);
	}

}
