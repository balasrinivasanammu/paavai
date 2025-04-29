package PaavaiDSpack;

public class Paavai13thdaysearchingtypes {

	public static void main(String[] args) {
		int a[]= {100,120,70,10,80};
		int src=70,stanley=0;
		for(int i=0;i<a.length;i++)
		{
			if(src==a[i])
			{
				stanley=1;
				break;
			}
			else
			{
				stanley=0;
			}	
		}
		if(stanley==1)
		{
			System.out.println("i got element");
		}
		else
		{
			System.out.println("not avilable");
		}
		
	}

}
