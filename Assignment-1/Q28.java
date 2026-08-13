import java.util.Arrays;
import java.util.Scanner;

public class Q28 {
    public int[] Array(Scanner sc, int n){
        int[] arr = new int[n];
        System.out.println("Enter Your Array:");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            
        }
        return arr;
    }
    
    public int[] BubbleSort(int[] arr, int n){

        for(int i=0; i<n; i++){
            for(int j=0; j<n-1-i; j++)
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        }

        return arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q28 sort = new Q28();
        System.out.println("Number of Elements in Array:");
        int n = sc.nextInt();

        int[] arr = sort.Array(sc, n);
        System.out.println("Your Sorted Array:" + Arrays.toString(sort.BubbleSort(arr, n)));
        
        sc.close();

    }
}
