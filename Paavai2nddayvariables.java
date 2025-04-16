package Paavaipack;

public class Paavai2nddayvariables 
{
	static
	{
		System.out.println("First static block");
	}
	void shalini() // non static
	{
		System.out.println("good morning");
	}
	
	static void mrsshalini()
	{
		System.out.println("good noon");
	}
	
	static void salemshalini() // definition
	{
		System.out.println("good evening");
	}
	static
	{
		System.out.println("last static block");
	}

	public static void main(String[] args) 
	{
		Paavai2nddayvariables sha=new Paavai2nddayvariables();
		System.out.println("good night");
		mrsshalini();
		salemshalini();// method calling
		sha.shalini();
		
		

	}

}
