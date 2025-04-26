package Paavaipack;

class Sriram
{
	private int amount=20000;
	int car=500000;
	int home=900000;
	void chennai()
	{
		System.out.println("Welcome chennai");
	}
}

class Sonofsriram extends Sriram
{
	int bike;
	void yercaud()
	{
		System.out.println("Welcome yercaud");
		System.out.println(car);
		System.out.println(home);
	}
}

class Drofsriram extends Sriram
{
	int jewels;
	void ooty()
	{
		System.out.println("Welcome ooty");
		//System.out.println(car);
		System.out.println(home);
	}
}
/*class Mrssriram
{
	void salem()
	{
		System.out.println(home);
	}
}*/

public class Paavai9thdayaccessspecifiers {

	public static void main(String[] args) {
		Sriram s=new Sriram();
		s.chennai();
		System.out.println(s.car);
		System.out.println(s.home);

	}

}
