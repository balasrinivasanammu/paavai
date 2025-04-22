package Paavaipack;

public class Pattern_x {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="RAMESHKUMAR";    
	    int row, column, norows = name.length();
	    for(row=0;row<norows; row++)
	    {
	        for(column=0;column<norows; column++)
	        {
	            if(((row+column)==(norows-1)))
	            	System.out.print(name.charAt(row));
	            else
	            System.out.print(" ");
	        }
	        System.out.println();
	    }

	}
}
/*

1 
1 2
1 2 3
a
a b
a b c


a b c
a b
a 

1 
3 5
7 9 11

2 
4 6*/