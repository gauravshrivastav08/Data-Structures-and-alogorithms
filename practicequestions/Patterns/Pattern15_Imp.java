package practicequestions.Patterns;

public class Pattern15_Imp {
    public static void main(String[] args) {
        pattern15(5);
    }

    public static void pattern15(int n)
    {
        int os = n/2;
        int st = 1;
        int val = 1;
        int temp = val;

        for(int i=0; i<n; i++)
        {
            for (int j=1; j<=os; j++)
                System.out.print("\t");
            for(int k=1; k<=st; k++)
            {
                System.out.print(temp + "\t");
                if(k<=st/2)
                    temp++;
                else
                    temp--;
            }

            if(i<n/2)
            {
                os--;
                st+=2;
                val++;
                temp = val;
            }

            else
            {
                os++;
                st-=2;
                val--;
                temp = val;
            }
            System.out.println();
        }
    }
}
