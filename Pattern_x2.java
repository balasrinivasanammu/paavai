package Paavaipack;

public class Pattern_x2 {
	public static void main(String[] args) {
		   int row,col,norow=7;
		    char name[] ={'B','a','l','a','j','i','s'};
		    for(row=0;row<norow;row++)
		    {
		        for(col=0;col<norow;col++)
		        {
		            if((row==col)||((row+col)==(norow-1)))
		            System.out.print(name[row]);
		            else
		            System.out.print(" ");
		        }
		        System.out.print("\n");
		    }
		}
}
