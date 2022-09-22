package week3.day1;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		String test="changeme";
		char[] charArray = test.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(i%2!=0)
			{
				char upperCase = Character.toUpperCase(charArray[i]);
				System.out.println(upperCase);
			}
			else
			{
				System.out.println(charArray[i]);
			}
						
		}

	}

}
