import java.util.*;

public class largestof3numbers{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 numbers 1 by 1:");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        
        if(a>b && a>c)
        System.out.printf("%d is the largest number",a);
        else if(b>a && b>c)
        System.out.printf("%d is the largest number",b);
        else
        System.out.printf("%d is the largest number",c);
        
    }
}