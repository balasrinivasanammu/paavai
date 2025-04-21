 package Paavaipack;

public class Paavai5thdayvariablestypes 
{
	static float salary=25000.2f;
	void mcube()
	{
		int jewels=50;
		System.out.println("mcube salary="+salary);
		System.out.println("mcube jewels="+jewels);
	}
	void paavai()
	{
		System.out.println("pavai salary = "+salary);
		//System.out.println("mcube jewels="+jewels);
	}
	static void xmcube()
	{
		System.out.println("xmcube salary="+salary);
	}
	public static void main(String[] args) 
	{
		Paavai5thdayvariablestypes p=new Paavai5thdayvariablestypes();
		xmcube();
		System.out.println("main salary="+salary);
		p.mcube();
		p.paavai();

	}

}
