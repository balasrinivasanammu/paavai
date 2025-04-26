package PaavaiDSpack;

public class Paavai11thdaythis {
	int apple=25;// non static global 
	void chennai(int apple)
	{
		int banana=this.apple;
		this.apple=apple;
		System.out.println(this.apple);
		System.out.println(banana);
	}

	public static void main(String[] args) {
		Paavai11thdaythis p=new Paavai11thdaythis();
		p.chennai(100);

	}

}
