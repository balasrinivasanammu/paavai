package Paavaipack;

public class Paavai6thdaystring {

	public static void main(String[] args) {
		//part 1 - char array - ended with '\0' char
		// stack
		char c1[]= {'m','a','n','g','o','c','i','t','y'};
		System.out.println(c1);
		for(int i=0;i<c1.length;i++)
		{
			System.out.println(c1[i]);	
		}
		
		//part 2 - String lietrals - heap(string cons pool)
		String s1="balaji srinivasan";
		//concat()
		System.out.println(s1);
		s1=s1.concat("guruaathvik");
		System.out.println(s1);
		s1=s1.concat("latha");
		System.out.println(s1);
		
		String s2="balaji srinivasan";
		System.out.println(s2);
		
		String s3="balaji magizhini";
		System.out.println(s3);
		
		//part 3 - String new Keyword
		
		String s4=new String("mango city");
		System.out.println(s4);
		
		String s5=new String("mango city");
		System.out.println(s5);
		
		
		//part 4 - StringBuffer new Keyword
		StringBuffer sb1=new StringBuffer("kutty ashwin");
		sb1.append("kutty mrsashwin");
		sb1.append(" Mrsaswhin");
		sb1.append(" lover");
		System.out.println(sb1);
		
		String n1="bSanthosh";
		System.out.println(n1);
		System.out.println(n1.length());
		System.out.println(n1.toUpperCase());
		System.out.println(n1.toLowerCase());
		System.out.println(n1.trim());
		System.out.println(n1.startsWith("b"));
		System.out.println(n1.charAt(4));
		System.out.println(n1.replace("tho","man"));
		System.out.println(n1.concat("king"));
		System.out.println(n1);
		 
		/*StringBuffer n2=new StringBuffer("balaji");
		System.out.println(n2.reverse());
		System.out.println(n2.append("srinivasan"));
		//System.out.prinltn(n2.)*/
		
		

	}

}
