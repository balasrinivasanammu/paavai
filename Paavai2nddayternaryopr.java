package Paavaipack;

public class Paavai2nddayternaryopr {

	public static void main(String[] args) {
		//part 1
		int a=10,b=5,c=15,d=20;
		/*if(a>b)//10>5
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}*/
		
		// part 2 - ternary or conditional opr
		//System.out.println((a>b && a>c && a>d) ?a:(b>c && b>d)?b:(c>d)?c:d);
		/*int result=((a>b && a>c && a>d) ?a:(b>c && b>d)?b:(c>d)?c:d);
		System.out.println(result);*/
		
		// Part 3
		
		if(a>b && a>c && a>d)
		{
			System.out.println(a);
		}
		else if(b>c && b>d)
		{
			System.out.println(b);
		}
		else if(c>d)
		{
			System.out.println(c);
		}
		else
		{
			System.out.println(d);
		}
	}

}
