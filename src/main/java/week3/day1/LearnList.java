package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		// 1. List - {Adam,Ben, Zara, Adam, Charlie, James, Ben}  add the data in list.
		List<String> name=new ArrayList<String>();
		name.add("Adam");
		name.add("Ben");
		name.add("Zara");
		name.add("Adam");
		name.add("Cahrlie");
		name.add("James");
		name.add("Ben");
		System.out.println(name);
		name.remove(2);
		System.out.println(name);
		System.out.println(name.contains("Adam"));
		System.out.println(name.get(0));
		System.out.println(name.size());
		System.out.println(name.isEmpty());
		name.clear();
		System.out.println(name);

		

	}

}
