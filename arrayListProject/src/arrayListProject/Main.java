package arrayListProject;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.add(1);
		numbers.add(10);
		numbers.add("İstanbul");
		//System.out.println(numbers.size());
		numbers.set(2, 100);
		System.out.println(numbers.get(2));
		numbers.remove(0);
		System.out.println(numbers.get(0));
		for(Object i:numbers) {
			System.out.println(i);
		}
	}

}
