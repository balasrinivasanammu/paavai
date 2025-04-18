package Paavaipack;
import java.util.*;

public class Paavai3rddayarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// part 1
		/*int a[]= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
			//System.out.println(a[i]);
		}
		System.out.println("my total="+sum);
		*/
       // part 2
		
		//Syntax:
		
		/*1) datatype vname[]=new datatype[size];
		2)datatype[] vname=new datatype[size];*/
		
		/*Scanner s=new Scanner(System.in);
		int apple[]=new int[5];
		int sum=0;
		for(int i=0;i<5;i++)
		{   
			apple[i]=s.nextInt();//i=0:10,i=1:20,i=2:30.......i=9:100
			sum=sum+apple[i];
			
		}
		System.out.println("my total="+sum);*/
		
		// part 3
		
		/*Scanner s=new Scanner(System.in);
		float apple[]=new float[5];
		float sum=0.0f;
		//int sum=0;
		for(int i=0;i<5;i++)
		{   
			apple[i]=s.nextFloat();//i=0:10,i=1:20,i=2:30.......i=9:100
			sum=sum+apple[i];	
		}
		System.out.println("my total="+sum);*/
		
		// part 4
		
		/*Scanner s=new Scanner(System.in);
		System.out.println("Enter the sizeoof an array:");
		int size=s.nextInt();
		float apple[]=new float[size];
		float sum=0.0f;
		//int sum=0;
		System.out.println("Enter the values an array:");
		for(int i=0;i<size;i++)
		{   
			apple[i]=s.nextFloat();//i=0:10,i=1:20,i=2:30.......i=9:100
			sum=sum+apple[i];	
		}
		System.out.println("my total="+sum);*/
		
		// part 5
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int size=s.nextInt();
		float apple[]=new float[size];
		float sum=0.0f;
		//int sum=0;
		System.out.println("Enter the values an array:");
		for(int i=0;i<size;i++)
		{   
			apple[i]=s.nextFloat();//i=0:10,i=1:20,i=2:30.......i=9:100
			if(apple[i]%7==0)
			{
			sum=sum+apple[i];
			}
		}
		System.out.println("my total="+sum);
		
	}

}
