import java.util.Scanner;

public class Q48 {
    public void Count(String str){
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            boolean done = false;

            for(int j=0; j<i; j++){
                if(str.charAt(j)==ch){
                    done = true;
                }
            }

            if(done==false){
                int freq = 0;
                for(int j=0; j<str.length(); j++){
                    if(str.charAt(j)==ch){
                        freq++;
                    }
                }
                System.out.println(ch+ " : "+ freq);
            }
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Q48 f = new Q48();

        System.out.print("Enter a String:");
        String str = sc.nextLine();

        f.Count(str);

        sc.close();
    }
}
