package application;

import java.util.ArrayList;
import java.util.List;

public class List1 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		
		for (String x : list) {
			System.out.println(x);
		}
	}

}
