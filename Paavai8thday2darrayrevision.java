package Paavaipack;

import java.util.Scanner;

public class Paavai8thday2darrayrevision {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r=s.nextInt();//2
		int c=s.nextInt();//3
		int age[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				age[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(age[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
