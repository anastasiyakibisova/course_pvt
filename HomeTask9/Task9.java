package core;

public class Task9 {

	public static void main(String[] args) {
		Starsystem starsystem = new Planet();
		starsystem.printClass();
		Planet planet = new Planet();
		planet.printClass();
		Star star = new Star();
		star.printClass();
		star.setWeight(1500);
		System.out.println(star.getWeight());
		Mars mars = new Mars();
		mars.printClass();
		Earth earth =new Earth();
		earth.printClass();
		Sirius sirius =new Sirius();
		sirius.printClass();
		Sun sun = new Sun("Photosphere", 5778);
		Sun sun2 = new Sun("Photosphere", 5778);
		sun.printClass();
		System.out.println(sun.equals(sun2));
		System.out.println(sun.hashCode());
		System.out.println(sun2.hashCode());
		System.out.println(sun.toString());
	}

}
