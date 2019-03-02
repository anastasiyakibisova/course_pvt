package core;

public class Task5_1 {

	public static void main(String[] args) {
		Tester tester = new Tester("Anastasiya ", "Kibisova ", 1);
		tester.getInformation();
		tester.getInformation(" B1 ");
		tester.getInformation(" B1 ", 1000);
		System.out.println(Tester.incomeTax(500));
		int marks[] = { 4, 4, 2, 4, 8, 1, 10, 4 };
		int m = marks[0] + marks[1];
		for (int i = 1; i < marks.length - 1; i++) {
			if (marks[i] + marks[i + 1] > m)
				m = marks[i] + marks[i + 1];
		}
		System.out.println("m=" + m);
		System.out.println(Expression.test("saz4"));
		System.out.println(Expression.test1("saz4"));
		int size = 10;
		int a = 10;
		int b = 50;
		int[] mas = new int[size];
		for (int i = 0; i < mas.length; i++) {
			mas[i] = a + (int) (Math.random() * (b - a));
		}
		Sorting.printMas(mas);
		Sorting.insertionSort(mas);
		Sorting.shellSort(mas);
		Sorting.mergeSort(mas, 0, mas.length - 1);
		Sorting.printMas(mas);
	}
}
