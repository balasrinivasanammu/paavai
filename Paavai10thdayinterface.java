package PaavaiDSpack;

interface Ashwin
{
	void testmatch();
}
interface Paavai extends Ashwin
{
	void oneday();
	void testmatch();	
}

abstract class Chennai implements Paavai
{
	void tennis()
	{
		System.out.println("one day match");
	}
}
public class Paavai10thdayinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chennai c=new Chennai();
		c.tennis();

	}

}
