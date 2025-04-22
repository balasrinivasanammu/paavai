package Paavaipack;

public class Balaji_Exception6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{	
			int result=25/0;
			System.out.println(result);
			try
			{
				String s=null;  
                System.out.println(s.length());	
			}
			catch(Exception e)
			{
				System.out.println("Null exception occurs");
			}
		}
		catch(Exception e)
		{
		System.out.println("Dnt know the exception. Program executed succesfully");	
		}
		finally {
			System.out.println("Hello");
		}
		
		

	}

}
