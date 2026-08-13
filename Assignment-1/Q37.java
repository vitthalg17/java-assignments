class MovieTicket {
    String movie;
    int seat;
    int price;

    MovieTicket(){
        movie = "Not Selected";
        seat = 0;
        price = 0;
    }

    MovieTicket(String movie){
        this.movie = movie;
        this.seat = 1;
        this.price = 150;
    }

    MovieTicket(String movie,int seat){
        this.movie = movie;
        this.seat = seat;
        this.price = 150;
    }

    MovieTicket(String movie,int seat,int price){
        this.movie = movie;
        this.seat = seat;
        this.price = price;
    }

    public void show(){
        System.out.println("Movie:"+ movie+ " Seat:"+ seat+ " Price:"+ price);
    }
}

public class Q37 {
    public static void main(String args[]){
        MovieTicket t1 = new MovieTicket();
        MovieTicket t2 = new MovieTicket("Dangal");
        MovieTicket t3 = new MovieTicket("Dangal", 14);
        MovieTicket t4 = new MovieTicket("Dangal", 14, 300);

        t1.show();
        t2.show();
        t3.show();
        t4.show();
    }
}
