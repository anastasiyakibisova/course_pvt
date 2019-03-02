package core;

public abstract class Starsystem {

	private int count;
	private String types;

	public void printTypes() {
		System.out.println(this.types);
	}

	public String countBy() {
		return (this.count == 3 ? "Triple Star Systems" : "Higher multiplicities");
	}

	public abstract void printClass();

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
		Starsystem starsystem = (Starsystem) obj;
		if (count != starsystem.count) {
			return false;
		}
		if (null == types) {
			return (types == starsystem.types);
		} else {
			if (!types.equals(starsystem.types)) {
				return false;
			}
		}
		return true;
	}

	public int hashCode() {
		return (int) (31 * count + ((null == types) ? 0 : types).hashCode());
	}

	public String toString() {
		return getClass().getName() + "@" + "types" + types + "count" + count;
	}
}
