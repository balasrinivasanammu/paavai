package Paavaipack;


public class Balaji_Exception4{  
	  public static void main(String args[]){  
	   
		  int i=10;
		  try
		  {
	   int data=25/i;
	   System.out.println(data);
		  }
		  
		  catch(ArithmeticException e)
		  {
			  System.out.println("Infinite occur. So this Arithmetic exception");
		  }
		  catch(NumberFormatException e)
		  {
			  System.out.println("Number exception");
		  }
	  finally
	  {
		  System.out.println("Take care");
	  }
		  
		  
		  
		  /*try
		  {
	   int data=25/i;
	   System.out.println(data);
		  }
		  catch(Exception e)
		  {
			  
		  }
		  finally
		  {
			  
		  }*/
		  
		  try {
			  try {
				  
			  }
			  
			  catch(ArithmeticException e)
			  {
				  
			  }
			  catch(Exception e)
			  {
				  
			  }
		  }
		  catch(Exception e)
		  {
			  
		  }
		  
	  
	  
	 
	  }  
	} 