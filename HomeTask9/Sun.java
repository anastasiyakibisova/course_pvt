package core;

public class Sun extends Star {

	String atmosphere;
	int temperature;

	public void printAtmosphere() {
		System.out.println(this.atmosphere);
	}

	public double inTemperatureEarth() {
		double averageTemperatureEarth = 287.2;
		return this.temperature / averageTemperatureEarth;
	}

	public Sun() {

	}

	public Sun(String atmosphere) {
		this.atmosphere = atmosphere;
	}

	public Sun(String atmosphere, int temperature) {
		this(atmosphere);
		this.temperature = temperature;
	}

	public void printClass() {
		System.out.println("This is Sun");
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
		Sun sun = (Sun) obj;
		if (temperature != sun.temperature) {
			return false;
		}
		if (null == atmosphere) {
			return (atmosphere == sun.atmosphere);
		} else {
			if (!atmosphere.equals(sun.atmosphere)) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		return (int) (31 * temperature + ((null == atmosphere) ? 0 : atmosphere).hashCode());
	}

	public String toString() {
		return getClass().getName() + "@" + "atmosphere " + atmosphere + " temperature " + temperature;
	}
}
