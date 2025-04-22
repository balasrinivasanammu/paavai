package Paavaipack;


public class Balaji_Exception5{  
	   static void validate(int Visa_date){  
	     if(Visa_date<18)  
	    	// System.out.println("Approval Cancel");
	    	throw new ArithmeticException("Approval Cancel");  
	     else  
	      System.out.println("Visa Approved");  
	   }  
	   public static void main(String args[]){  
	      validate(15);  
	      System.out.println("Balance Code");  
	  }  
	}





// Exception part2 

/*static void validate(int Visa_date)throws InvalidAgeException{  
     if(Visa_date<18)  
      throw new InvalidAgeException("Approval Cancel");  
     else  
      System.out.println("Visa Approved");  
   }  
     
   public static void main(String args[]){  
      try{  
      validate(13);  
      }catch(Exception m){System.out.println("Exception occured: "+m);}  
  
      System.out.println("rest of the code...");  
  }  */
