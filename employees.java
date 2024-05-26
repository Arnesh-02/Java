class employee{
    String name;
    double salary;
    String address;
    String jobtitle;
    public employee(String name,double salary,String address,String jobtitle){
        this.name=name;
        this.salary=salary;
        this.address=address;
        this.jobtitle=jobtitle;
    }
}
class manager extends employee {
    public manager(String a, String add) {
        super(a, 9000, add, "manager");
    }
}

class developer extends employee{
    public developer(String a, String add){//only getting values for name and address
        super(a, 120000, add, "developer");//super keyword is used to call its parent class
    }
}

class programmer extends employee{
    public programmer(String a,String add){
        super(a,45000,add,"Programmer");
    }
}

public class employees {
    public static void main(String args[]) {
        manager obj = new manager("Arun", "Main road, Tiruppur");//obj for class manager
        System.out.println("Employee: " + obj.name);
        System.out.println("Salary: " + obj.salary);
        System.out.println("Address: " + obj.address);
        System.out.println("Job Description: " + obj.jobtitle);
        System.out.println("\n\n");
        developer obj1 = new developer("A", "Coloumbia");//obj1 for class developer
        System.out.println("Employee: " + obj1.name);
        System.out.println("Salary: " + obj1.salary);
        System.out.println("Address: " + obj1.address);
        System.out.println("Job Description: " + obj1.jobtitle);
        System.out.println("\n\n");
        programmer obj2 = new programmer("B", "USA");
        System.out.println("Employee: " + obj2.name);
        System.out.println("Salary: " + obj2.salary);
        System.out.println("Address: " + obj2.address);
        System.out.println("Job Description: " + obj2.jobtitle);
        
        
    }
}
