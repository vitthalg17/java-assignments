import java.util.Scanner;

public class Q26 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("How many Numbers?");
        int n = sc.nextInt();
        int[] Num = new int[n];
        int[] Rev = new int[n];
        
        System.out.println("Enter " + n + " Numbers:");
        for(int i=0; i<n; i++){
            Num[i] = sc.nextInt();
        }

    
        for(int i=n-1; i>=0; i--){
            Rev[n-i-1] = Num[i];
            
        }

        System.out.println("Reversed Array:"+ java.util.Arrays.toString(Rev));

        sc.close();
    }
    
    
}
