class Employee {
    String name;
    int basicPay;

    Employee(String name,int basicPay){
        this.name = name;
        this.basicPay = basicPay;
    }

    public int pay(){
        return basicPay;
    }

    public void show(){
        System.out.println(name+ " gets "+ pay());
    }
}

class Manager extends Employee {
    Manager(String name,int basicPay){
        super(name, basicPay);
    }

    public int pay(){
        return basicPay+5000;
    }
}

class Developer extends Employee {
    Developer(String name,int basicPay){
        super(name, basicPay);
    }

    public int pay(){
        return basicPay+3000;
    }
}

public class Q2 {
    public static void main(String args[]){
        Employee e1 = new Employee("Ravi", 20000);
        Employee e2 = new Manager("Neha", 20000);
        Employee e3 = new Developer("Amit", 20000);

        e1.show();
        e2.show();
        e3.show();
    }
}
