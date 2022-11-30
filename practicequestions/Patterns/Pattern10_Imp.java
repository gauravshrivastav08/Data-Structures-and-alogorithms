package practicequestions.Patterns;

public class Pattern10_Imp {
    public static void main(String[] args) {
        pattern10(5);
    }

    public static void pattern10(int n)
    {
        int os = n/2;
        int is = -1;

        for(int i=0; i<n; i++)
        {
            for(int j=1; j<=os; j++)
                System.out.print("\t");

            System.out.print("*\t");

            for(int k=1; k<=is; k++)
                System.out.print("\t");

            if(i>0 && i<n-1)
                System.out.print("*\t");
            else
                System.out.print("\t");

            if(i<n/2)
            {
                os--;
                is+=2;
            }
            else
            {
                os++;
                is-=2;
            }

            System.out.println();
        }
    }
}
