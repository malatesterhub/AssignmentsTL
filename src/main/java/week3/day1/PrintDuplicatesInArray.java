package week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		//int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> num=Arrays.asList(14,12,13,11,15,14,18,16,17,19,18,17,20);
		System.out.println(num);
		//HashSet
		HashSet<Integer> removeDuplicateNum=new HashSet<Integer>();
		
		for(int i=0;i<num.size();i++)
		{
			if(removeDuplicateNum.add(num.get(i))==false)
			{
				System.out.println("Duplicate is:"+num.get(i));
			}
		}
	}

}
