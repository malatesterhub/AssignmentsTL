package week1.day1;

public class Mobile {

	public void makeCall ()
	{
		String mobileModel="SAMSUNG GALAXY";
		float mobileWeight=163.0f;
		System.out.println("Make Call to the Registered Mobile Number");
	}
    public void sendMsg()
    {
    	boolean isFullCharged=true;
		int mobileCost=17500;
	    System.out.println("Send Message to the Registered Mobile Number");
    }
    public static void main(String[]args) 
    {
		Mobile mob=new Mobile();
		mob.makeCall();
		mob.sendMsg();
		System.out.println("This is My mobile");
    }
}