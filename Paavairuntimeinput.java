package Paavaipack;
import java.util.Scanner;
public class Paavairuntimeinput 
{
	public static void main(String[] args) 
	{
		int apple; //Declaration
		Scanner stanley=new Scanner(System.in); //Object Creation for Scanner Class 
		System.out.println("Enter the apple rate:");
		apple = stanley.nextInt(); //Get the Input from the user for apple variable
		System.out.println("Apple Purchased rate : "+apple);
		
		float salary;
		System.out.println("Enter the salary:");
		salary = stanley.nextFloat(); //Get the Input from the user for apple variable
		System.out.println("Salary level = : "+salary);
		
		double tax;
		System.out.println("Enter the tax:");
		tax = stanley.nextDouble(); //Get the Input from the user for apple variable
		System.out.println("Tax level = : "+tax);
		
		
		 
		
		
	}

}
