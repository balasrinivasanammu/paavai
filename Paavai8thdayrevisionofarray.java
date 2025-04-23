package Paavaipack;
import java.util.*;

public class Paavai8thdayrevisionofarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int si=s.nextInt();
		char grade[]=new char[si];
		for(int i=0;i<si;i++)
		{
			grade[i]=s.next().charAt(0);
		}
		//part 1
		/*for(int i=0;i<si;i++)
		{
			if((int)grade[i]%2==0)
			System.out.println(grade[i]);
		}*/
		// part 2
		/*for(int i=0;i<si;i++)
		{
			
			System.out.println(grade[i]);
		}*/
		
		// part 3
		/*for(int i=0;i<si;i++)
		{
			System.out.println((int)grade[i]);
		}*/
		
		// part 4
		for(int i=0;i<si;i++)
		{
			System.out.println((char)(grade[i]+1));
		}
		
				

	}

}
