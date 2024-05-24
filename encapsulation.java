import java.util.*;

class Main{
    private long roll_no;
    private int ph_no; //need not be public-encapsulation is done here
    private String name;
    Scanner sc=new Scanner(System.in);
    
    public void getname(){
        System.out.println("Enter name: ");
        name=sc.nextLine();
      
    }
    public void getph_no(){
        System.out.println("Enter phone number: ");
        ph_no=sc.nextInt();
    }
     public void getroll_no(){
        System.out.println("Enter roll no: ");
        roll_no=sc.nextInt();
    }
    public void display_details(){
        System.out.println("Name of student "+name);
        System.out.println("Phone number "+ph_no);
        System.out.println("Roll no "+roll_no);
        
    }
}

public class encapsulation extends Main
{
	public static void main(String[] args) {
	    encapsulation ob=new encapsulation();
	    ob.getname();
	    ob.getroll_no();
	    ob.getph_no();
	    ob.display_details();
	    
		
	}
}
