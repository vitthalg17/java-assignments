import java.util.Scanner;

public class Q27 {
    public int[][] Matrix(Scanner sc, int row, int col){
        int[][] mat = new int[row][col];

        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

    public int[][] Add(int[][] mat1, int[][] mat2, int row, int col){
        int[][] addMat = new int[row][col];
        for (int i=0; i<row; i++){
            System.out.print("[");
            for(int j=0; j<col; j++){
                addMat[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(addMat[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
        return addMat;
    }

    public int[][] Mul(int[][] mat1, int[][] mat2, int row1, int col1, int col2){
        int[][] mulMat = new int[row1][col2];
        for (int i=0; i<row1; i++){
            System.out.print("[");
            for(int j=0; j<col2; j++){
                mulMat[i][j] = 0;
                for (int k=0; k<col1; k++){
                    mulMat[i][j] += mat1[i][k] * mat2[k][j];
                }
                System.out.print(mulMat[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
        return mulMat;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Q27 MatApp = new Q27();

        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int[][] mat1 = MatApp.Matrix(sc, row1, col1);

        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int[][] mat2 = MatApp.Matrix(sc, row2, col2);

        if(row1 == row2 && col1 == col2){
            MatApp.Add(mat1, mat2, row2, col2);
        }

        if(col1 == row2){
            MatApp.Mul(mat1, mat2, row1, col1, col2);
        }

        sc.close();
    }
}