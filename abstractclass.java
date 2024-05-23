abstract class calculator{
    public abstract int add(int a,int b);
    public abstract int sub(int a,int b);
}

public class abstractclass extends calculator
{
    public int add(int a,int b){
	        return a+b;
	    }
	    
	public int sub(int a,int b){
	        return a-b;
	    }
	public static void main(String[] args) {
		Main ob=new Main();
		System.out.printf("Addition :%d",ob.add(2,4));
		System.out.printf("\nSubtraction :%d",ob.sub(5,6));
	}
}
