class Visitor {
    static int totalVisitors = 0;
    String name;

    Visitor(String name){
        this.name = name;
        totalVisitors++;
    }

    public void showName(){
        System.out.println("Visitor Name:"+ name);
    }

    static void showTotal(){
        System.out.println("Total Visitors:"+ totalVisitors);
    }
}

public class Q40 {
    public static void main(String args[]){
        Visitor.showTotal();

        Visitor v1 = new Visitor("Vitthal");
        Visitor v2 = new Visitor("Riya");
        Visitor v3 = new Visitor("Karan");

        v1.showName();
        v2.showName();
        v3.showName();

        Visitor.showTotal();
    }
}
