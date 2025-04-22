package Paavaipack;

 
public class Balaji_Exception2 {  
	  
    public static void main(String[] args) {  
          
           try{    
                int a[]=new int[10];    
                a[5]=500/0;    
               }    
           catch(Exception e)  
           {  
            System.out.println("Parent Exception occurs");  
           } 
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  } 
           catch(NullPointerException e)  
           {  
            System.out.println("NullPointer Exception occurs. Try to solve on it.");  
           }
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  } 
           
          
           
           
           
               System.out.println("Balance Code");
    	/*try {
    		//int result=500/0;
    		int a[]=new int[10]; 
    		a[20]=100/10;
    	}
    	
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println("Arr indx out of bunds ex");
    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println("Cant divd by 0");
    	}
    	catch(Exception e)
    	{
    		System.out.println("this is my error");
    	}
    	
    	
    	
    	System.out.println("bye");*/
    }  
}  
