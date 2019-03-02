package core;

public class Person {

	public String name;
	public String surname;
	public int age;
	public int phone;

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public int getAge() {
		return this.age;
	}

	public int getPhone() {
		return this.phone;
	}

	public void printAllInformation() {
		String message = "Name is %s, Surname is %s, Age is %s, Phone is %s";
		System.out.println(getName() + getSurname() + getAge() + getPhone());
	}

	public void printName() {
		String message = "Name is %s, Surname is %s";
		System.out.println(getName() + getSurname());
	}

	public boolean isAdult() {
		return getAge() > 18? true: false;
		}
	}
}
