package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		//int[] arr = {1,2,3,4,7,6,8};
		List<Integer> num=new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(7);
		num.add(6);
		num.add(8);
		num.add(10);
		//Arrange the array in ascending order
		Collections.sort(num);
		System.out.println(num);
		int lastIndex=num.size()-1;
		for(int i=1;i<=num.get(lastIndex);i++)
		{
			if(!num.contains(i))
			{
				System.out.println("The missing number is:"+i);
			}
				
				
		}
	}

}
