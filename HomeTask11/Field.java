package core;

public class Field {

	private int id;
	private int value;

	public Field(int id, int value) {
		this.id = id;
		this.value = value;
	}

	public String toString() {
		return this.id + " " + this.value;
	}
}
