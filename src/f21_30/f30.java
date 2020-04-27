package f21_30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class f30 {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(2);
		li.add(0);
		li.add(6);
		li.add(5);
		insert(li, 4);
	}
	
	public static void insert(List<Integer> li,int num) {
		TreeSet<Integer> tr = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				int num = i1.compareTo(i2);
				return num == 0 ? 1 : num;
			}			
		});
		tr.addAll(li);
		tr.add(num);
		for (Integer integer : tr) {
			System.out.print(integer);
		}
	}
}
