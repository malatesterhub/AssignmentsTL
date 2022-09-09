package week1.day2.assignment;

public class Assignment2 {

	public static void main(String[] args)
	{
		int num=34343;
		int reversed=0;
		int remainder;
		int tempnum=num;	
		for(int i=1;i<=5;i++)
		{
			remainder=num%10;
			reversed=reversed*10+remainder;
			num=num/10;
		}
		if(tempnum==reversed)
		{
			System.out.println("This is palindrome number" );
		}
		else
			System.out.println("This is not a palindrome number");
	}

}
