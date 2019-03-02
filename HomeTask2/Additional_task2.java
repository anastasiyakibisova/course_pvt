package core;

import java.util.ArrayList;
import java.util.Iterator;

public class Additional_task2 {

	public static void main(String[] args) {
//		Создать список ArrayList, заполнить его строковыми или числовыми значениями. 
//		при помощи цикла for each:
//		вывести все элементы списка
//		к каждому из элементов прибавить любое число (или строку, если список строковый)
//		удалить последовательно все элементы
//		удалить сразу все элементы
		ArrayList<String> list = new ArrayList<String>();
		list.add("195");
		list.add("job");
		// print
		for (String l : list) {
			System.out.println(l);
		}
		// add string
		for (String l : list) {
			System.out.println(l + " hello");
		}
		// delete list
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			String s = iter.next();
			if (s.equals(s)) {
				iter.remove();
			}
		}
		// delete list all
		list.removeAll(list);

	}

}
