package Paavaipack;
import java.util.*;

public class Paavai5thdayarrays 
{
	public static void main(String[] args) 
	{	
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int score[]=new int[size];
		for(int i=0;i<size;i++)
		{
			score[i]=s.nextInt();
		}
		int high=0;
		for(int i=0;i<size;i++)
		{
			if(high<score[i])
			{
				high=score[i];
			}
		}
		System.out.println(high);
	}
}
