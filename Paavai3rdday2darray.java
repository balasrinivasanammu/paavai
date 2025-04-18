package Paavaipack;

import java.util.Scanner;

public class Paavai3rdday2darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// part 1
		/*int apple[][]= {
				{11,20,30},
				{40,55,60},
				{70,80,99}
		};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(apple[i][j]+" ");
			}
			System.out.println();
		}*/
		
		// part 2
				/*int apple[][]= {{11,20,33},{40,56,60},{77,88,99}};
				for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
						if(apple[i][j]%11==0)
						{
						System.out.print(apple[i][j]+" ");
						}
					}
					System.out.println();
				}*/
		
		// part 3
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row size:");
		int rsize=s.nextInt();// rows
		System.out.println("Enter the col size:");
		int csize=s.nextInt(); // cols
		int apple[][]= new int[rsize][csize];
		System.out.println("Enter the values:");
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				apple[i][j]=s.nextInt();// get input from user	
			}
		}
		System.out.println("MY 2D output:");
		for(int i=0;i<rsize;i++)
		{
			for(int j=0;j<csize;j++)
			{
				if(apple[i][j]%20==0)
				{
				System.out.print(apple[i][j]+" ");	
				}
			}
			 System.out.println();
		}

	}

}
