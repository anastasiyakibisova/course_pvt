package core;

public class Earth extends Planet {

	double surface = 510.072;
	String satellites;

	public void printSatellites() {
		System.out.println(this.satellites);
	}

	public double surfaceLand() {
		double percentageOfLand = 29.1;
		return this.surface * percentageOfLand / 100;
	}

	public void printClass() {
		System.out.println("This is Earth");
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
		Earth earth = (Earth) obj;
		if (surface != earth.surface) {
			return false;
		}
		if (null == satellites) {
			return (satellites == earth.satellites);
		} else {
			if (!satellites.equals(earth.satellites)) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		return (int) (31 * surface + ((null == satellites) ? 0 : satellites).hashCode());
	}

	public String toString() {
		return getClass().getName() + "@" + "satellites" + satellites + "surface" + surface;
	}
}
