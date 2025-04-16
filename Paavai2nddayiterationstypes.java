package Paavaipack;
import java.util.*;

public class Paavai2nddayiterationstypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//part 1
		/*int i;
		for(i=1;i<=10;i++)
		{
			System.out.print(i+"\n");
		}*/
		
		// part 2
		/*int i=1;
		while(i<=10)
		{
			System.out.print(i+"\n");
			i++;
		}*/
		
		// part 3 - exit control loop
		/*int i=100;
		do
		{
			System.out.print(i+"\n");
			i++;
		}while(i<=10);*/
		
		// part 4
		
		int i,amount=10000;
		Scanner s=new Scanner(System.in);
		
		for(i=1;i<=5;i++)
		{
			
			System.out.println("Enter the amount:");
			int transaction=s.nextInt();
			amount=amount-transaction;
			if(i>3)
			{
				amount=amount-21;
			}
			System.out.println(amount);
		}

	}

}
