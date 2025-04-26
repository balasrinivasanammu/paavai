package PaavaiDSpack;
// part 1 - multilevel
/*
class Apple
{
	void testmatch()
	{
		System.out.println("test match");
	}
}
class Banana extends Apple
{
	void onedaymatch()
	{
		System.out.println("onedaymatch match");
	}
}
class Pineapple extends Banana
{
	void match2020()
	{
		System.out.println("match2020 match");
	}
	
}

public class Paavai10thdayallinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pineapple p=new Pineapple();
		p.match2020();
		p.onedaymatch();
		p.testmatch();

	}

}
*/
//part 2 - Hierarchical
/*class Apple
{
	void testmatch()
	{
		System.out.println("test match");
	}
}
class Banana extends Apple
{
	void onedaymatch()
	{
		System.out.println("onedaymatch match");
	}
}
class Pineapple extends Apple
{
	void match2020()
	{
		System.out.println("match2020 match");
	}
	
}
public class Paavai10thdayallinheritance {
	
	public static void main(String[] args) {
		Pineapple p=new Pineapple();
		Banana b=new Banana();
		p.match2020();
		p.testmatch();
		//p.onedaymatch();
		b.onedaymatch();
		b.testmatch();
		
	}
}*/

//part 3 - Hybrid
class Apple
{
	void testmatch()
	{
		System.out.println("test match");
	}
}
class Banana extends Apple
{
	void onedaymatch()
	{
		System.out.println("onedaymatch match");
	}
}
class Pineapple extends Banana
{
	void match2020()
	{
		System.out.println("match2020 match");
	}
}
class Cherry extends Apple
{
	void iplmatch()
	{
		System.out.println("ipl match");
	}
}
	

public class Paavai10thdayallinheritance {
	
	public static void main(String[] args) {
		Pineapple p=new Pineapple();
		Cherry c=new Cherry();
	}
}
	

