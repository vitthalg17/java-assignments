import java.util.Scanner;

public class Q29 {
    public void Matrix(Scanner sc, int row, int col){
        int[][] mat = new int[row][col];

        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Your Entered Matrix:");
        System.out.println("[");
        for (int i = 0; i < row; i++) {
            System.out.print(" [");
            for (int j = 0; j < col; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println(" ]");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q29 TwoD = new Q29();

        System.out.print("Enter Number of Rows:");
        int row = sc.nextInt();
        System.out.print("Enter Number of Columns:");
        int col = sc.nextInt();
        TwoD.Matrix(sc, row, col);
    }
}
