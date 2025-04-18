package Paavaipack;

public class Paavai3rddaysymposium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// part 1
		/*int rollno;
		for(rollno=1;rollno<=100;rollno++)
		{
			if(rollno==20 || rollno == 40 || rollno==60)
			{
				continue;
			}
			System.out.println("allowed "+rollno);
		}*/
		
		// part 2
		
		int rollno;
		for(rollno=1;rollno<=100;rollno++)
		{
			if(rollno>50)
			{
				break;
			}
			System.out.println("allowed "+rollno);
		}


	}

}
