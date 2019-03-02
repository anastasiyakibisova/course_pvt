package core;

public class Planet extends Starsystem {

	private double size;
	private String name;

	public Planet() {

	}

	public Planet(double size) {
		this.size = size;
	}

	public Planet(double size, String name) {
		this.size = size;
		this.name = name;
	}

	public void namePlanet() {
		System.out.println(this.name);
	}

	public double sizePlanet() {
		double num = 2;
		return this.size * num;
	}

	public void printClass() {
		System.out.println("This is Planet");
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (null == obj) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Planet planet = (Planet) obj;
		if (size != planet.size) {
			return false;
		}
		if (null == name) {
			return (name == planet.name);
		} else {
			if (!name.equals(planet.name)) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		return (int) (31 * size + ((null == name) ? 0 : name).hashCode());
	}

	public String toString() {
		return getClass().getName() + "@" + "name" + name + "size" + size;
	}
}
