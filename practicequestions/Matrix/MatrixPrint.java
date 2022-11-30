package practicequestions.Matrix;

public class MatrixPrint {

    public static void main(String[] args) {
        int a[][] = {
                {1,2,3,6},
                {4,5},
                {6,7,8,9},
                {10,11}
        };

        printMatrix(a);
    }

    public static void printMatrix(int a[][])
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
