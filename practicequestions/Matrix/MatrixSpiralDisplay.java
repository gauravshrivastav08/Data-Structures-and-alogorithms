package practicequestions.Matrix;

public class MatrixSpiralDisplay {
    public static void main(String[] args) {
        int a[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        printSpiralMatrix(a);
    }

    public static void printSpiralMatrix(int a[][])
    {
        int minr = 0;
        int minc = 0;
        int maxr = a.length-1;
        int maxc = a[0].length-1;

        int tne = (maxr+1) * (maxc+1);
        int count = 0;
        System.out.println("Total number of elements are : " + tne);

        while (count < tne) {
            // Left Wall
            for (int i = minr, j = minc; i <= maxr && count<tne ; i++) {
                System.out.println(a[i][j]);
                count++;
            }
            minc++;


            // Bottom Wall
            for (int i = maxr, j = minc; j <= maxc && count<tne ; j++) {
                System.out.println(a[i][j]);
                count++;
            }
            maxr--;

            // Right Wall
            for (int i = maxr, j = maxc; i >= minr && count<tne; i--) {
                System.out.println(a[i][j]);
                count++;
            }
            maxc--;

            //Top Wall
            for (int i = minr, j = maxc; j >= minc && count<tne; j--) {
                System.out.println(a[i][j]);
                count++;
            }
            minr++;
        }
    }
}
