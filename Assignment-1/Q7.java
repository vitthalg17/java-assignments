class Room {
    int roomNo;
    int seats;

    Room(int roomNo,int seats){
        this.roomNo = roomNo;
        this.seats = seats;
    }

    public void show(){
        System.out.println("Room No:"+ roomNo+ " Seats:"+ seats);
    }
}

class ClassRoom extends Room {
    String subject;

    ClassRoom(int roomNo,int seats,String subject){
        super(roomNo, seats);
        this.subject = subject;
    }

    public void show(){
        super.show();
        System.out.println("Subject:"+ subject);
    }
}

public class Q7 {
    public static void main(String args[]){
        ClassRoom cr = new ClassRoom(203, 60, "Java");
        cr.show();
    }
}
