package practicequestions.Matrix;

public class MatrixSpiralDisplayClockwise {
    public static void main(String[] args) {
        int a[][] =
                {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                };

        spiralMatrixDisplay(a);
    }

    public static void spiralMatrixDisplay(int a[][])
    {
        int minrow = 0;
        int maxrow = a.length-1;
        int mincol = 0;
        int maxcol = a[0].length-1;

        int tne = (maxrow+1) * (maxcol+1);
        int count = 0;

        while(count < tne) {

            for (int i = minrow, j = mincol; j <= maxcol && count<tne; j++) {
                System.out.println(a[i][j]);
                count++;
            }
            minrow++;

            for (int i = minrow, j = maxcol; i <= maxrow && count<tne; i++) {
                System.out.println(a[i][j]);
                count++;
            }
            maxcol--;

            for (int i = maxrow, j = maxcol; j >= mincol && count<tne; j--) {
                System.out.println(a[i][j]);
                count++;
            }
            maxrow--;

            for (int i = maxrow, j = mincol; i >= minrow && count<tne; i--) {
                System.out.println(a[i][j]);
                count++;
            }
            mincol++;

        } // end of while
    }
}
