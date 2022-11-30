package practicequestions.Matrix;

/*
To Reverse a Matrix by 90 degree, you've to transpose the matrix
and reverse the rows
 */

public class ReverseMatrixBy90 {
    public static void main(String[] args) {
        int a[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        reverseMatrix90(a);
    }

    public static void reverseMatrix90(int a[][])
    {
        // Loop for matrix transpose
        for(int i=0; i<a.length; i++)
        {
            for (int j=i; j<a[0].length; j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Loop to reverse the rows
        for(int i=0; i<a.length; i++)
        {
            int li=0;
            int ri = a[0].length-1;
            while (li < ri)
            {
                int temp = a[i][li];
                a[i][li] = a[i][ri];
                a[i][ri] = temp;
                li++;
                ri--;
            }
        }

        // Display the Matrix
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
