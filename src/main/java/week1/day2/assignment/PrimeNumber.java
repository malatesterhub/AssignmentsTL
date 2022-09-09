package week1.day2.assignment;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		int pn=15;
		boolean b=false;
		for(int i=2;i<=(pn/2);i++)
		{
			if(pn%i==0)
			{
				b=true;
				break;
			}
						
		}
		if(b)
		{
			System.out.println("The given number is Not Prime Number");
		}
		else
			System.out.println("The given number is Prime Number");

	}

}
