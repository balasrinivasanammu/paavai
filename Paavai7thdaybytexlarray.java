package Paavaipack;
import java.util.Scanner;
public class Paavai7thdaybytexlarray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int salary[]=new int[size];
		for(int i=0;i<size;i++)
		{
			salary[i]=s.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(salary[i]>salary[j])
				{
				int temp=salary[i];
				salary[i]=salary[j];
				salary[j]=temp;
				}	
			}
		}
		System.out.print("[");
		for(int k=0;k<size-1;k++)
		{
			System.out.print(salary[k]+", ");
		}
		
		System.out.print(salary[size-1]+"]");
		
		
	

	}

}
