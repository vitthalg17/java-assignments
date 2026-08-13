abstract class Question {
    String text;
    int marks;

    Question(String text,int marks){
        this.text = text;
        this.marks = marks;
    }

    abstract void ask();

    public void showMarks(){
        System.out.println("Marks:"+ marks);
    }
}

class McqQuestion extends Question {
    String optionA;
    String optionB;
    String optionC;

    McqQuestion(String text,int marks,String optionA,String optionB,String optionC){
        super(text, marks);
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
    }

    void ask(){
        System.out.println(text);
        System.out.println("1) "+ optionA);
        System.out.println("2) "+ optionB);
        System.out.println("3) "+ optionC);
    }
}

class TrueFalseQuestion extends Question {
    TrueFalseQuestion(String text,int marks){
        super(text, marks);
    }

    void ask(){
        System.out.println(text);
        System.out.println("Write True or False");
    }
}

public class Q44 {
    public static void main(String args[]){
        Question q1 = new McqQuestion("Which one runs the java bytecode?", 2, "JVM", "JDK", "JRE");
        Question q2 = new TrueFalseQuestion("Java supports multiple inheritance using classes.", 1);

        q1.ask();
        q1.showMarks();

        System.out.println("-------------------------");

        q2.ask();
        q2.showMarks();
    }
}
