package practicequestions.Patterns;

public class Pattern_17 {
    public static void main(String[] args) {
        pattern_17(6);
    }

    public static void pattern_17(int n)
    {
        int st = 1;
        int sp = (2*n -3);

        for(int i=1; i<=n; i++)
        {
            int val=1;
            for(int j=1; j<=st; j++)
            {
                System.out.print( val + "\t");
                val++;
            }

            for(int k=1; k<=sp; k++)
                System.out.print("\t");

            if(i == n) {
                st--;
                val--;
            }

            for(int j=1; j<=st; j++)
            {
                val--;
                System.out.print(val + "\t");
            }

            if(i<=st/2)
            {
                val++;
            }
            st++;
            sp-=2;
            System.out.println();
        }
    }
}
