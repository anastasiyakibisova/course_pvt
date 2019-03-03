package core;

import java.util.ArrayList;
import java.util.List;

public class Dropdown {

	private boolean isSelected;
	private String name;
	private List<String> options = new ArrayList<String>();

	public Dropdown(boolean isSelected, String name, List<String> options) {
		this.isSelected = isSelected;
		this.name = name;
		this.options = options;
	}

	public String toString() {
		return this.isSelected + " " + this.name + " " + this.options;
	}
}
