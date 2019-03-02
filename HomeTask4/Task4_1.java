package core;

public class Task4_1 {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Anastasiya");
		person.setSurname("Kibisova");
		person.setAge(15);
		person.setPhone(5555555);
		System.out.println(person.getName());
		System.out.println(person.getSurname());
		System.out.println(person.getAge());
		System.out.println(person.getPhone());
		person.printAllInformation();
		person.printName();
		System.out.println(person.isAdult());

	}

}
