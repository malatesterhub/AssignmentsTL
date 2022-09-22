package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
	//int[] data = {3,2,11,4,6,7};
		List<Integer> num=new ArrayList<Integer>();
		num.add(3);
		num.add(2);
		num.add(11);
		num.add(4);
		num.add(6);
		num.add(7);
		//Arrange the array in ascending order
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);
		int index=num.size()-2;
		System.out.println(num.get(index));
	}

}
