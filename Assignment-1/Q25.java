import java.util.Scanner;

public class Q25 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        
        int sum = 0;
        System.out.print("How many Numbers?");
        int n = sc.nextInt();
        int[] Num = new int[n];
        
        System.out.println("Enter " + n + " Numbers:");
        for(int i=0; i<n; i++){
            Num[i] = sc.nextInt();
        }

    
        for(int i=0; i<Num.length; i++){
            sum += Num[i];
            
        }

        System.out.println("Sum of Array:"+ sum);

        sc.close();
    }
    
    
}
