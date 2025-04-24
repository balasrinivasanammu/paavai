package PaavaiDSpack;

public class Paavai9thdayconstructor {
	
	Paavai9thdayconstructor()// default cons
	{
		System.out.println("hi baby");
	}
	Paavai9thdayconstructor(int a)// parameterized cons
	{
		System.out.println("shajit family persons "+a);
	}
	Paavai9thdayconstructor(float a)// parameterized cons
	{
		System.out.println("mrsshajit family persons "+a);
	}
	Paavai9thdayconstructor(float a,char c)// parameterized cons
	{
		System.out.println("xshajit family persons "+a+" "+c);
	}

	public static void main(String[] args) {
		Paavai9thdayconstructor	shajit=new Paavai9thdayconstructor();
		Paavai9thdayconstructor	mrsshajit=new Paavai9thdayconstructor(10.5f);
		Paavai9thdayconstructor	xshajit=new Paavai9thdayconstructor();
		Paavai9thdayconstructor	xxshajit=new Paavai9thdayconstructor(20.5f,'g');

	}

}
