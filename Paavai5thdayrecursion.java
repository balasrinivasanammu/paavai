package Paavaipack;

public class Paavai5thdayrecursion 
{
	int sum(int n)
	{
		if(n!=0)
		{
			return n*sum(n-1);
		}
		else
		{
			return n;
		}	
	}
	public static void main(String[] args) 
	{
		Paavai5thdayrecursion p=new Paavai5thdayrecursion();
		int num=5;
		System.out.println(p.sum(num));
		
	
	}
}
