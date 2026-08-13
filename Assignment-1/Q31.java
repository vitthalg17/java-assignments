import java.util.Arrays;
import java.util.Scanner;

public class Q31 {
    public int[] Array(Scanner sc,int n){
        int[] arr = new int[n];
        System.out.println("Enter "+ n+ " Numbers:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public int[] Remove(int[] arr,int n){
        int[] temp = new int[n];
        int count = 0;

        for(int i=0; i<n; i++){
            boolean found = false;
            for(int j=0; j<count; j++){
                if(temp[j]==arr[i]){
                    found = true;
                }
            }
            if(found==false){
                temp[count] = arr[i];
                count++;
            }
        }

        int[] result = new int[count];
        for(int i=0; i<count; i++){
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Q31 dup = new Q31();

        System.out.print("How many Numbers?");
        int n = sc.nextInt();

        int[] arr = dup.Array(sc, n);

        System.out.println("Array After Removing Duplicates:"+ Arrays.toString(dup.Remove(arr, n)));

        sc.close();
    }
}
