import java.util.Scanner;

public class Q50{
    public void pal(String str) {
        String revStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }

        if (revStr.equals(str)) {
            System.out.println("Your String " + str + " is a Palindrome!");
        } else {
            System.out.println("Your String " + str + " is NOT a Palindrome!");
        }
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        Q22 palindrome = new Q22();

        System.out.println("Enter a String:");
        String str = sc.nextLine();

        palindrome.pal(str);

        sc.close();

    }
}