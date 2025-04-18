package Paavaipack;

// part 1
// 1. method without arg and without return keyword
/*public class Paavai4thdayfunctions1 {
	void mango()// method definition
	{
		System.out.println("Welcome to mango city");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paavai4thdayfunctions1 p=new Paavai4thdayfunctions1();
		p.mango();// method calling

	}

}*/

// part 2
//2. method without arg and with return keyword
/*public class Paavai4thdayfunctions1 {
	int mango()// method definition
	{
		int a=10,b=25;
		int c=a+b;
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paavai4thdayfunctions1 p=new Paavai4thdayfunctions1();
		int result=p.mango();// method calling
		System.out.println(result);

	}

}*/
//part 3
//3. method with arg and without return keyword
/*public class Paavai4thdayfunctions1 {
	void mango(int rate,int price,char grade,float tax)// method definition
	{
		int total=rate+price;
		System.out.println("Apple rate="+total);
		System.out.println(grade);
		System.out.println(tax);
	}
	public static void main(String[] args) {
		
		Paavai4thdayfunctions1 p=new Paavai4thdayfunctions1();
		p.mango(100,200,'A',25.5f);// method calling
		

	}

}*/


//part 4
//4. method with arg and with return keyword
public class Paavai4thdayfunctions1 {
	int mango(int apple,int banana)// method definition
	{
		int fruit=apple+banana;
		return fruit;
	}
	public static void main(String[] args) {
		
		Paavai4thdayfunctions1 p=new Paavai4thdayfunctions1();
		int result=p.mango(100,200);// method calling
		System.out.println(result);

	}

}




