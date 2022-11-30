package practicequestions.Matrix;

public class DiagonalTraversal {
    public static void main(String[] args) {

        int a[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        diagonalUpperMatrixDisplay(a);
//        diagonalLowerMatrixDisplay(a);
    }

    public static void diagonalUpperMatrixDisplay(int a[][])
    {
        for(int g=0; g<a.length; g++)
        {
            for(int i=0, j=g; j<a.length; j++, i++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    } // End of upperMatrixDisplay function


    public static void diagonalLowerMatrixDisplay(int a[][])
    {
        for(int g=0; g<a.length; g++)
        {
            for(int i=g, j=0; i<a.length; j++, i++)
            {
                System.out.println(a[i][j]);
            }
        }
    }

    public static void lowerMatrixPrint(int a[][])
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                if (i >=j)
                {
                    System.out.print(a[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void upperMatrixPrint(int a[][])
    {
        for(int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[0].length; j++)
            {
                if(i<=j)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
