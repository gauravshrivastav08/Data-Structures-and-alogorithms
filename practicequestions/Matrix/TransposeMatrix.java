package practicequestions.Matrix;

/*

Transpose a Matrix means, convert the rows of a Matrix to Columns

 */
public class TransposeMatrix {
    public static void main(String[] args) {
    int a[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };

    transposeMatrixDisplay(a);
    }

    public static void transposeMatrixDisplay(int a[][])
    {
        //Putting the elements in transpose way
        for(int i=0; i<a.length; i++)
        {
            for (int j=i; j<a[0].length; j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Display the Matrix
        for(int i=0; i<a.length;i++)
        {
            for(int j=0; j<a[0].length;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
