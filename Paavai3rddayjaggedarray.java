package Paavaipack;

public class Paavai3rddayjaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple[][]= {
				{10,20,30},
				{40,50,60,70},
				{80,90}
		};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<apple[i].length;j++)
			{
				System.out.print(apple[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
