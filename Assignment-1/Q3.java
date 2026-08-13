interface Printable {
    void print();
}

class IdCard implements Printable {
    String name;
    int rollNo;

    IdCard(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public void print(){
        System.out.println("ID Card of "+ name+ ", Roll No:"+ rollNo);
    }
}

class Ticket implements Printable {
    String movie;
    int seat;

    Ticket(String movie,int seat){
        this.movie = movie;
        this.seat = seat;
    }

    public void print(){
        System.out.println("Ticket for "+ movie+ ", Seat No:"+ seat);
    }
}

public class Q3 {
    public static void main(String args[]){
        Printable p1 = new IdCard("Vitthal", 45);
        Printable p2 = new Ticket("Interstellar", 12);

        p1.print();
        p2.print();
    }
}
