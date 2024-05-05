import java.util.*;
public class reverseno{
  public static void main(String [] args){
    int n,sum=0,a=0;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter a number to reverse:");
    n=obj.nextInt();
    while(n!=0){
        a=n%10;
        sum=sum*10+a;
        n=n/10;
    }
    System.out.println("Reversed number "+sum);
    obj.close();
  }
}