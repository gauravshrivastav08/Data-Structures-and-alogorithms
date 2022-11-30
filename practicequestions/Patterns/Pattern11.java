package practicequestions.Patterns;

public class Pattern11 {
    public static void main(String[] args) {
        pattern11(5);
    }

    public static void pattern11(int n)
    {
        int val = 1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print( val + "\t");
                val++;
            }
            System.out.println();
        }
    }
}
