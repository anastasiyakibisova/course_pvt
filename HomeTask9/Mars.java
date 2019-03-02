package core;

public class Mars extends Planet {

	double periodOfCirculation; 
	String color;

	public void colorMars() {
		System.out.println(this.color);
	}

	public double periodOfCirculationInYears() {
		int year = 365;
		return this.periodOfCirculation / year;
	}

	public void printClass() {
		System.out.println("This is Mars");
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
		Mars mars = (Mars) obj;
		if (periodOfCirculation != mars.periodOfCirculation) {
			return false;
		}
		if (null == color) {
			return (color == mars.color);
		} else {
			if (!color.equals(mars.color)) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		return (int) (31 * periodOfCirculation + ((null == color) ? 0 : color).hashCode());
	}

	public String toString() {
		return getClass().getName() + "@" + "color" + color + "periodOfCirculation" + periodOfCirculation;
	}
}
