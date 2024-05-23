public class overriding{
    public void func(){
        System.out.println("Inside function-1 with no arguments");
    }
    public void func(int a,int b){
        System.out.println("Inside function-2 with 2 int arguments");
    }
    public void func(int a,int b,int  c){
        System.out.println("Inside function-3 with 3 int arguments");
    }
    public static void main(String[] args){
        overriding ob=new overriding();
        ob.func();
        ob.func(1,2);
        ob.func(1,2,3);
    }
}