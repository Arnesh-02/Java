import java.util.*;

public class maxele{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no of elements in array:");
        int n=obj.nextInt();
        int [] a= new int[n];
        int ele;
        System.out.println("Enter the elements 1 by 1:");
        for(int i=0;i<n;i++){
            ele=obj.nextInt();
            a[i]=ele;
        }
        int max=a[0];
        for(int j=1;j<n;j++){
            if(max<a[j])
            max=a[j];
        }
        System.out.println("Max element in array:"+max);
        
    }
}