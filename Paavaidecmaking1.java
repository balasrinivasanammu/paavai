package Paavaipack;
import java.util.*;
public class Paavaidecmaking1 
{

	public static void main(String[] args) 
	{
		int Atmpin,pin=3456;
		int OtpI,Otp=456789;
		Scanner cr=new Scanner(System.in);
		Atmpin=cr.nextInt();
		OtpI=cr.nextInt();
		if(Atmpin==pin | OtpI==Otp)
		{
			System.out.println("Login Successful ");
		}
		else
		{
			System.out.println("Login Failed");
		}

	}

}
