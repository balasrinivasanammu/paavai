package Paavaipack;

public class Pattern_z {
	public static void main(String[] args) {
		char a[]={'P','R','I','Y','A'};
		for(int i=0;i<5;i++)
		{
		    System.out.print(a[i]);
		}
		System.out.print("\n");
		for(int i=3;i>=1;i--)
		{
		    for(int k=1;k<=i;k++)
		    {
		        System.out.print(" ");
		    }
		    System.out.println(a[i]);
		}
		for(int i=0;i<5;i++)
		{
		    System.out.print(a[i]);
		}
		}
}
