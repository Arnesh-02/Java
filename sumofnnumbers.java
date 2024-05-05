import java.util.Scanner;
public class sumofnnumbers{
    public static void main(String args[]){
        int n,sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number for sum:");
        n=obj.nextInt();
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println("\nSum value:"+sum);
    }
}