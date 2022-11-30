package practicequestions.Matrix;

public class WaveTraversal {
    public static void main(String[] args) {

        int a[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        waveTraversal(a);
    }

    public static void waveTraversal(int a[][])
    {
        for(int j=0; j<a[0].length; j++)
        {
            if(j%2 == 0)
            {
                for(int i=0; i<a.length;i++)
                    System.out.println(a[i][j]);
            }

            else
            {
                for(int i=a.length-1; i>=0; i--)
                    System.out.println(a[i][j]);
            }
        }
    }
}
