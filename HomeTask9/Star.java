package core;

public class Star extends Starsystem {

	double weight; 
	String typesOfStars;

	public void printTypes() {
		System.out.println(this.typesOfStars);
	}

	public double weightStar() {
		return this.weight;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getTypesOfStars() {
		return typesOfStars;
	}

	public void setTypesOfStars(String typesOfStars) {
		this.typesOfStars = typesOfStars;
	}

	public void printClass() {
		System.out.println("This is Star");
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
		Star star = (Star) obj;
		if (weight != star.weight) {
			return false;
		}
		if (null == typesOfStars) {
			return (typesOfStars == star.typesOfStars);
		} else {
			if (!typesOfStars.equals(star.typesOfStars)) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		return (int) (31 * weight + ((null == typesOfStars) ? 0 : typesOfStars).hashCode());
	}

	public String toString() {
		return getClass().getName() + "@" + "typesOfStars" + typesOfStars + "weight" + weight;
	}
}
