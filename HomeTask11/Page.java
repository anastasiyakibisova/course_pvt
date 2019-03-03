package core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Page {

	public float id;
	public String title;
	public ArrayList<Button> myArrayList = new ArrayList<Button>();
	public LinkedList<Field> myLinkedList = new LinkedList<Field>();
	public HashSet<Label> myHashSet = new HashSet<Label>();
	public HashMap<Integer, Dropdown> myHashMap = new HashMap<Integer, Dropdown>();
	TreeSet<Button> treeSet = new TreeSet<Button>();

	public void addTreeSet(Button a) {
		treeSet.add(a);
	}

	public boolean addArrayList(Button a) {
		return myArrayList.add(a);
	}

	public void addLinkedList(Field a) {
		myLinkedList.addLast(a);
	}

	public boolean addHashSet(Label a) {
		return myHashSet.add(a);
	}

	public Dropdown addHashMap(Integer n, Dropdown b) {
		return myHashMap.put(n, b);
	}

	public boolean delArrayList(Button a) {
		return myArrayList.remove(a);
	}

	public boolean delLinkedList(Field a) {
		return myLinkedList.remove(a);
	}

	public boolean delHashSet(Label a) {
		return myHashSet.remove(a);
	}

	public boolean delTreeSet(Button a) {
		return treeSet.remove(a);
	}

	public Dropdown delHashMap(int b) {
		return myHashMap.remove(b);
	}

	public void replaceArrayList(int n, Button a) {
		myArrayList.set(n, a);
	}

	public void replaceLinkedList(int n, Field a) {
		myLinkedList.set(n, a);
	}

	public void replaceHashSet(Label a, Label b) {
		if (myHashSet.contains(a)) {
			myHashSet.remove(a);
			myHashSet.add(b);
		}
	}

	public void replaceTreeSet(Button a, Button b) {
		if (treeSet.contains(a)) {
			treeSet.remove(a);
			treeSet.add(b);
		}
	}

	public Dropdown replaceHashMap(Integer n, Dropdown b) {
		return myHashMap.replace(n, b);
	}

	public void printArrayList() {
		Iterator<Button> iter = myArrayList.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public void printLinkedList() {
		for (Field i : myLinkedList) {
			System.out.println(i);
		}
	}

	public void printHashSet() {
		Iterator<Label> iter = myHashSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public void printHashMap() {
		Set<Map.Entry<Integer, Dropdown>> set = myHashMap.entrySet();
		for (Map.Entry<Integer, Dropdown> me : set) {
			System.out.println("key = " + me.getKey() + ", value = " + me.getValue());
		}
	}

	public void printTreeSet() {
		for (Button person : treeSet) {
			System.out.println(person.toString());
		}
	}

	public void sortArrayList() {
		Collections.sort(myArrayList);
	}
}
