import java.util.*;
public class calculator
{
	public static void main(String[] args) {
	    try{
	    Scanner obj=new Scanner(System.in);
		int a,b;
		System.out.println("Enter 2 numbers 1 by 1:");
		a=obj.nextInt();
		b=obj.nextInt();
	
		while(true){
    	System.out.println("\nEnter 1 to perform addition\n 2 to perform subraction\n 3 to perform multiplication \n 4 to perform division\n 5 to exit");
		int ch=obj.nextInt();
		switch(ch){
		    case 1:
		        System.out.printf("Addition :%d",a+b);
		        break;
		    case 2:
		        System.out.printf("Subtraction :%d",a-b);
		        break;
		        
		  case 3:
		        System.out.printf("Multiplication :%d",a*b);
		        break;
		  case 4:
		        System.out.printf("Division :%d",a/b);
		        break;
		  case 5:
		      return;
		}
		}
	 }
	 catch(ArithmeticException e){
	     System.out.println(e);
	     e.printStackTrace();
	 }
	    
	}
}
