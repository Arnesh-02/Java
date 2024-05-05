import java.util.*;
import java.math.*;

public class areaoftrinagle{
public static void main (String[] args) {
    Scanner obj =new Scanner(System.in);
    float b,h;
    System.out.println("Enter height of trinagle:");
    h=obj.nextFloat();
    System.out.println("Enter base length of trinagle:");
    b=obj.nextFloat();
    double area=0.5*b*h;
    System.out.println("Area of trianle:"+area);
    }
}