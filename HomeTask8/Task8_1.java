package core1;

import core.Tester;

public class Task8_1 {

	public static void main(String[] args) {
		Tester tester = new Tester("Petr", "Petrov", 10, "B1", 1000);
		tester.setSalary(15000); // friendly доступен классам, находящимся в том же пакете.
		System.out.println(tester.getSalary());// friendly доступен классам, находящимся в том же пакете.
		tester.multiplyByTwo(100); // private -доступн только в созданном классе
		System.out.println(tester.experienceInMonths(2));// friendly доступен классам, находящимся в том же пакете.
		tester.printNameSurname();// protected доступен классам, находящимся в том же пакете, и подклассам – в
									// других пакетах
		System.out.println();
		tester.allInformation();

	}

}
