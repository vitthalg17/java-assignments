import java.util.ArrayDeque;
import java.util.Deque;

public class Q51 {
    static boolean isPalindrome(String text) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : text.toLowerCase().toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                deque.addLast(c);
            }
        }

        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"racecar", "Madam", "Never odd or even", "Java", "A man, a plan, a canal: Panama", "Hello"};

        for (String w : words) {
            if (isPalindrome(w)) {
                System.out.println("\"" + w + "\" is a palindrome");
            }
            else {
                System.out.println("\"" + w + "\" is not a palindrome");
            }
        }
    }
}
