public class Q18 {
    public static void main(String args[]){
        int[] Num = {23,46,1,98,17};
        int small = Num[0];
        int large = Num[0];

        for(int i=0; i<Num.length; i++){
            if (Num[i]<small){
                small = Num[i];
            }

            if (Num[i]>large){
                large = Num[i];
            }
        }

        System.out.println("Largest Number in the Array:"+ large);
        System.out.println("Smallest Number in the Array:"+ small);
    }
    
}
