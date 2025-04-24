package Paavaipack;
class A
{
	void add()
	{
		System.out.println("first parent call");
	}
	void add(int a)
	{
		System.out.println("first parent call a value="+a);
	}
}
class B extends A
{
	void add(int a)
	{
		System.out.println("first child call a value="+a);
		super.add(20);
	}
	
}

public class Poly {

	public static void main(String[] args) {
		B b=new B();
		b.add();

	}

}
