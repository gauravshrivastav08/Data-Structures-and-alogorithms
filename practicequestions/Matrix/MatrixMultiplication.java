package practicequestions.Matrix;

/*
To multiply 2 Matrices of size R1XC1 and R2XC2, C1 and R2 must be of same size otherwise they can't get multiply.
 Assume there are 2 matrices of size, 2X3 and 3X4 and if we multiply them, final matrix will come in size of
 2X4
 */

public class MatrixMultiplication {
    public static void main(String[] args) {
//        System.out.println("Please enter the size of first matrix in-terms of row and columns");
//        Scanner s1 = new Scanner(System.in);
//        int R1 = s1.nextInt();
//        int C1 = s1.nextInt();
//        int a[][] = new int[R1][C1];
//
//        System.out.println("Please enter the values of first matrix ");
//        for(int i=0; i<a.length; i++)
//        {
//            for(int j=0; j<a[i].length; j++)
//            {
//                a[i][j] = s1.nextInt();
//            }
//        }
//
//        System.out.println("Please enter the size of 2nd Matrix in-terms of rows and columns");
//        Scanner s2 = new Scanner(System.in);
//        int R2 = s2.nextInt();
//        int C2 = s2.nextInt();
//        int b[][] = new int[R2][C2];
//
//        System.out.println("Please enter the elements of 2nd Matrix ");
//        for (int i=0; i<b.length; i++)
//        {
//            for(int j=0; j<b[i].length; j++)
//            {
//                b[i][j] = s2.nextInt();
//            }
//        }

        ////////////// Print Matrix Values /////////////////////////
//        matrixPrint(a,b);
        
        int one[][] = {
                {1,2,3},
                {4,5,6}
                        };

        int two[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12} };

        matrixMultiply(one, 2, 3, two, 3, 4);
    }

    public static void matrixMultiply(int a[][], int R1, int C1, int b[][], int R2, int C2)
    {

        int c[][] = new int[R1][C2];

        if(C1!=R2)
        {
            System.out.println("Matrix can't be multiply since C1 and R2 are not same");
            return;
        }
        else {

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    for (int k = 0; k < C1; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
        }

        for (int i=0; i<c.length; i++)
        {
            for (int j=0; j<c[i].length; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void matrixPrint(int a[][], int b[][])
    {
        // First Matrix Print
        System.out.println("Printing the elements of First Matrix ");
        System.out.println();
        System.out.println("[ ");
        for (int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("]");

        System.out.println();
        System.out.println("Printing the elements of 2d Matrix");
        System.out.println();
        System.out.println("[ ");
        // Second Matrix Print
        for(int i=0; i<b.length; i++)
        {
            for(int j=0; j<b[i].length; j++)
            {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("]");
    }
}
