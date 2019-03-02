package core;

public class Task8 {

	public static void main(String[] args) {
		Tester tester = new Tester();
		Tester tester = new Tester("Petr", "Petrov", 10, "B1", 1000);
		tester.setSalary(15000);
		System.out.println(tester.getSalary());
		tester.multiplyByTwo(100); // private -доступн только в созданном классе
		System.out.println(tester.experienceInMonths(2));
		tester.printNameSurname();
		System.out.println();
		tester.allInformation();

	}

}
