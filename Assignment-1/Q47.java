import java.util.Scanner;

public class Q47 {
    public String Reverse(String str){
        int n = str.length();
        char[] ch = new char[n];

        for(int i=0; i<n; i++){
            ch[i] = str.charAt(i);
        }

        for(int i=0; i<n/2; i++){
            char temp = ch[i];
            ch[i] = ch[n-1-i];
            ch[n-1-i] = temp;
        }

        String rev = "";
        for(int i=0; i<n; i++){
            rev += ch[i];
        }
        return rev;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Q47 r = new Q47();

        System.out.print("Enter a String:");
        String str = sc.nextLine();

        System.out.println("Reversed String:"+ r.Reverse(str));

        sc.close();
    }
}
