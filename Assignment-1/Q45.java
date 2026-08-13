final class Aadhaar {
    long number;

    Aadhaar(long number){
        this.number = number;
    }

    public void show(){
        System.out.println("Aadhaar Number:"+ number);
    }
}

class Exam {
    final void passingMarks(){
        System.out.println("Passing Marks:35");
    }

    public void totalMarks(){
        System.out.println("Total Marks:100");
    }
}

class UnitTest extends Exam {
    public void totalMarks(){
        System.out.println("Total Marks:20");
    }
}

public class Q45 {
    public static void main(String args[]){
        Exam e = new Exam();
        e.totalMarks();
        e.passingMarks();

        System.out.println("-------------------------");

        UnitTest u = new UnitTest();
        u.totalMarks();
        u.passingMarks();

        System.out.println("-------------------------");

        Aadhaar a = new Aadhaar(123456789012L);
        a.show();
    }
}
