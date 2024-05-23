interface car{
    public void maxspeed();
    public void mileage();
    default void driver(){
        System.out.println("Car can be drove only by 1 person ");
    }
}

class mclaren implements car{
    public void maxspeed(){
        System.out.println("Mc laren runs at max speed of 403km/h ");
    }
    public void mileage(){
        System.out.println("Mc laren gives mileage of 21.7 KM/L");
    }
}

class audi implements car{
    public void maxspeed(){
        System.out.println("Audi runs at max speed of 250 km/h ");
    }
    public void mileage(){
        System.out.println("Audi runs gives mieage of 17.8 KM/L");
    }
}

public class interfaces{
    public static void main(String [] args){
    mclaren ob1=new mclaren();
    ob1.maxspeed();
    ob1.mileage();
    ob1.driver();
    audi ob2=new audi();
    ob2.maxspeed();
    ob2.mileage();
}
}