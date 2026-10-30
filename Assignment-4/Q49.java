import java.util.Stack;

public class Q49 {
    public static void main(String[] args) {
        Stack<String> edits = new Stack<>();

        System.out.println("Is the undo history empty? " + edits.isEmpty());

        edits.push("Typed a heading");
        edits.push("Made it bold");
        edits.push("Added a picture");
        edits.push("Changed font size");
        System.out.println("Undo history : " + edits);

        System.out.println("Last edit (peek) : " + edits.peek());

        System.out.println("Undo : " + edits.pop());
        System.out.println("Undo : " + edits.pop());
        System.out.println("Undo history : " + edits);

        System.out.println("Is the undo history empty? " + edits.isEmpty());

        edits.pop();
        edits.pop();
        System.out.println("Undid everything, is it empty now? " + edits.isEmpty());
    }
}
