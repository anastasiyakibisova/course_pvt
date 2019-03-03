package core;

import java.util.ArrayList;
import java.util.List;

public class HomeTask11 {

	public static void main(String[] args) {

		Page page = new Page();
		Button b1 = new Button("summa", 10);
		Button b2 = new Button("mylt", 20);
		Button b3 = new Button("division", 3);
		Button b4 = new Button("sub", 5);
		page.addTreeSet(b1);
		page.addTreeSet(b2);
		page.addTreeSet(b3);
		page.replaceTreeSet(b2, b4);
		page.delTreeSet(b4);
		page.printTreeSet();
		page.addArrayList(b1);
		page.addArrayList(b2);
		page.addArrayList(b3);
		page.replaceArrayList(1, b4);
		page.delArrayList(b1);
		page.printArrayList();
		page.sortArrayList();
		System.out.println();
		page.printArrayList();
		Field f1 = new Field(1, 10);
		Field f2 = new Field(2, 15);
		Field f3 = new Field(3, 20);
		Field f4 = new Field(4, 25);
		page.addLinkedList(f1);
		page.addLinkedList(f2);
		page.addLinkedList(f3);
		page.replaceLinkedList(1, f4);
		page.delLinkedList(f3);
		page.printLinkedList();
		Label l1 = new Label("1");
		Label l2 = new Label("2");
		Label l3 = new Label("3");
		Label l4 = new Label("4");
		page.addHashSet(l1);
		page.addHashSet(l2);
		page.addHashSet(l3);
		page.replaceHashSet(l2, l4);
		page.printHashSet();
		page.delHashSet(l3);
		page.printHashSet();
		List<String> a1 = new ArrayList<String>();
		a1.add("111");
		Dropdown d1 = new Dropdown(true, "1", a1);
		Dropdown d2 = new Dropdown(false, "2", a1);
		Dropdown d3 = new Dropdown(true, "3", a1);
		Dropdown d4 = new Dropdown(false, "4", a1);
		page.addHashMap(1, d1);
		page.addHashMap(2, d2);
		page.addHashMap(3, d3);
		page.replaceHashMap(2, d4);
		page.delHashMap(2);
		page.printHashMap();

	}

}
