class Library {
    public String libraryName = "City Library";
    protected String address = "MG Road";
    String timing = "9 AM to 6 PM";
    private int totalBooks = 1200;

    public int getTotalBooks(){
        return totalBooks;
    }
}

public class Q9 {
    public static void main(String args[]){
        Library lib = new Library();

        System.out.println("public Name:"+ lib.libraryName);
        System.out.println("protected Address:"+ lib.address);
        System.out.println("default Timing:"+ lib.timing);
        System.out.println("private Total Books:"+ lib.getTotalBooks());
    }
}
