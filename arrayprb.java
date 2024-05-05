import java.util.*;
public class arrayprb{
  public static void main(String [] args){
    int n;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter no of elemets  in array:");
    n=obj.nextInt();
    int [] a=new int[n];
    for (int i=0;i<n;i++){
      System.out.print("Enter element "+i);
      a[i]=obj.nextInt();
    }
    System.out.println("Even numbers are \n");
    for(int num:a){
      if (num%2==0){
        System.out.println(num);
      } 
    }
    obj.close();
  }
}