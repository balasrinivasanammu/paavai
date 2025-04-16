package Paavaipack;
import java.util.*;

public class Paavai2nddaystringinput {

	public static void main(String[] args) {
		/*Scanner s=new Scanner(System.in);
		System.out.println("Stdin & Stdout:");
		
		String name=s.nextLine();
		int age=s.nextInt();
		
		System.out.println(name+" "+age);*/
		
		/*char grade=s.next().charAt(0);
		int age=s.nextInt();
		String name=s.next();
		System.out.println(grade+" "+name+" "+age);*/
		
		// part 2 - hacker rank
		/*Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        String s=scan.next();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);*/
		
		
		
		// part 3 - get input for string and char
		/*Scanner stanley=new Scanner(System.in);
		System.out.println("Stdin & Stdout:");
		char grade=stanley.next().charAt(6);
		System.out.println(grade);*/
		
		// part 4 - get input for string
		/*Scanner stanley=new Scanner(System.in);
		System.out.println("Stdin & Stdout:");
		String college=stanley.nextLine();
		System.out.println(college);*/
		
		// part 5 - next() & nextLine() diff
		
		String sampleText = 
		        " Programmers love Java!\n"
		      + " User input with Java is so easy!\n"
		      + " Just use the Scanner class.\n"
		      + " Or maybe the Console or JOptionPane?\n";
		//System.out.println(sampleText);
		    Scanner scanner = new Scanner(sampleText);

		    System.out.println("First call : " + scanner.nextLine());
		    System.out.println("Second call: " + scanner.nextLine());
		    System.out.println("Third call : " + scanner.next());
		    System.out.println("Fourth call: " + scanner.next());
		    System.out.println("Fifth call: " + scanner.nextLine());

		
		

	}

}
