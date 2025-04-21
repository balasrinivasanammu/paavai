package Paavaipack;

public class Paavai5thdayvariablestypes1 {
	int apple=20;// non static global variable
	static int banana=30;// static global variable
	void sriram()
	{
		int pineapple=40;// local variable
		System.out.println(++apple);
		System.out.println(++banana);
		System.out.println(++pineapple);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paavai5thdayvariablestypes1 p=new Paavai5thdayvariablestypes1();
		p.sriram();
		p.sriram();
		p.sriram();
		
	}

}
