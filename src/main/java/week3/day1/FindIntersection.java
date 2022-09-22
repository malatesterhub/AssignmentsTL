package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection 
{
	public static void main(String[] args)
	{
		List<Integer> a=new ArrayList<Integer>();
		a.add(3);
		a.add(2);
		a.add(11);
		a.add(4);
		a.add(6);
		a.add(7);
		List<Integer> b=new ArrayList<Integer>();
		b.add(1);
		b.add(2);
		b.add(8);
		b.add(4);
		b.add(9);
		b.add(7);
		for(int i=0;i<a.size();i++)
		{
			for(int j=0;j<b.size();j++)
			{
				if(a.get(i).equals(b.get(j)))
				{
					System.out.println("The Intersect numbers are :" + a.get(i));
				}
			}
		}
	

	}

}
