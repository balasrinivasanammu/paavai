package Paavaipack;

import java.util.Scanner;

public class Paavai8thdaystringrevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String myname=s.nextLine();
		for(int i=0;i<myname.length();i++)
		{
			if(myname.charAt(i)=='a')
			{
				System.out.print('z');
			}
			else if( myname.charAt(i)=='e' || myname.charAt(i)=='i' || myname.charAt(i)=='o' || myname.charAt(i)=='u')
			{
				System.out.print((char)(myname.charAt(i)-1));
			}
			else
			{
				System.out.print((char)(myname.charAt(i)+1));
			}
		}

	}

}
