package Paavaipack;
import java.util.*;

public class Paavai3rdday2darraymulti 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row size:");
		int rsize=s.nextInt();
		System.out.println("Enter the col size:");
		int csize=s.nextInt();
		int girlcr[][]=new int[rsize][csize];
		int boycr[][]=new int[rsize][csize];
		int stanlycr[][]=new int[rsize][csize];
		System.out.println("Enter the girlcr values:");
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				girlcr[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter the boycr values:");
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				boycr[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				stanlycr[i][j]=girlcr[i][j]*boycr[i][j];
			}
		}
		System.out.println("My Output stanly cr values:");
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				System.out.print(stanlycr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
