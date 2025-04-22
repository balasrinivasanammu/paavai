package Paavaipack;

public class Pattern_v {
	public static void main(String[] args)
	{
	  char a[]={'P','R','I','Y','A','S'};
	    for(int i=5;i>=0;i--)
	    {
	    	for(int j=5;j>i;j--)
	    	{
	    		System.out.print(" ");
	    	}
	    	System.out.print(a[i]);
	    	
	   if(i>=1)
	   System.out.print(a[i]);
	   System.out.print("\n");
	}
	   
	}
}

