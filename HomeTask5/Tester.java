package core;

public class Tester {

	public String name;
	public String surname;
	public int expirienceInYears;
	public String englishLevel;
	public int salary;

	public Tester() {

	}

	public Tester(String name) {
		this();
		this.name = name;
	}

	public Tester(String name, String surname) {
		this(name);
		this.surname = surname;
	}

	public Tester(String name, String surname, int expirienceInYears) {
		this(name, surname);
		this.expirienceInYears = expirienceInYears;
	}

	public void getInformation() {
		System.out.println(this.name + this.surname + this.expirienceInYears);
	}

	public void getInformation(String englishLevel) {
		System.out.println(this.name + this.surname + this.expirienceInYears + englishLevel);
	}

	public void getInformation(String englishLevel, int salary) {
		System.out.println(this.name + this.surname + this.expirienceInYears + englishLevel + salary);
	}

	public static double incomeTax(int salary) {
		double coefficient = 0.13;
		return salary * coefficient;
	}

}
