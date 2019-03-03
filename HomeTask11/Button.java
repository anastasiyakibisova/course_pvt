package core;

public class Button implements Comparable<Button> {

	private String name;
	private int action;

	public Button(String name, int action) {
		this.name = name;
		this.action = action;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAction() {
		return action;
	}

	public void setAction(int action) {
		this.action = action;
	}

	public String toString() {
		return this.name + " " + this.action;
	}

	@Override
	public int compareTo(Button o) {
		return name.compareTo(o.name);
	}

}
