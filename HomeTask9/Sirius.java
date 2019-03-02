package core;

public class Sirius extends Star {

	String latinName;
	double luminosity;

	public void printType() {
		System.out.println(this.latinName);
	}

	public double luminositySun() {
		double luminositySun = 25;
		return this.luminosity / luminositySun;
	}

	public void printClass() {
		System.out.println("This is Sirius");
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
		Sirius sirius = (Sirius) obj;
		if (luminosity != sirius.luminosity) {
			return false;
		}
		if (null == latinName) {
			return (latinName == sirius.latinName);
		} else {
			if (!latinName.equals(sirius.latinName)) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		return (int) (31 * luminosity + ((null == latinName) ? 0 : latinName).hashCode());
	}

	public String toString() {
		return getClass().getName() + "@" + "latinName" + latinName + "luminosity" + luminosity;
	}
}
