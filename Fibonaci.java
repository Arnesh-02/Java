import java.util.*;
public class Fibonaci
{
	public static void main(String[] args) {
		int n;
		System.out.println("Enter number :");
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		int sum=fibonaaci(n);
		System.out.println("Fibonaaci sum:"+sum);
	}
	public static int fibonaaci(int n){
	    if (n==0 || n==1){
	        return 1;
	    } 
	    else{
	       return fibonaaci(n-1)+fibonaaci(n-2);
	    }
	}
}
