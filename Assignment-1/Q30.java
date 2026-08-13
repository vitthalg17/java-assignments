import java.util.Scanner;

public class Q30 {
    public int[] Array(Scanner sc, int n){
        int[] arr = new int[n];
        System.out.println("Enter Your Sorted Array:");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            
        }
        return arr;
    }

    public int Search(int[] arr,int n, int num){
        int low = 0;
        int high = n-1;
        
        
        while(low <= high){
            int mid = (low+(high-low)/2);
            if (arr[mid]== num){
                return mid;
            }
            else if (arr[mid]< num){
                low =mid+1;
            }
            else{
                high =mid-1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q30 Binary = new Q30();
        System.out.println("Enter the Number of Elements:");
        int n = sc.nextInt();

        int[] arr= Binary.Array(sc, n);

        System.out.println("Enter the Number to Find:");
        int num = sc.nextInt();
        int target = Binary.Search(arr, n, num);
        if( target == -1){
            System.out.println("Not Found!");
        }else{
            System.out.println(num +" Found at " + target);

        }


    }
}
