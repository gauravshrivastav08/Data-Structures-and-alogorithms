package practicequestions.Patterns;

/*

Permutation and Combination Question

nCk+1 = nCk * (n-k) / k+1

iCj+1 = iCj * (i-j)/ j+1;

1
1	1
1	2	1
1	3	3	1
1	4	6	4	1

 */
public class Pattern13_Imp {
    public static void main(String[] args) {
        pattern13(5);
    }

    public static void pattern13(int n)
    {

        for(int i=0; i<n; i++)
        {
            int icj = 1;
            for(int j=0; j<=i; j++)
            {
                System.out.print(icj + "\t");
                int icjp1 = icj * (i-j)/(j+1);
                icj = icjp1;
            }
            System.out.println();
        }
    }
}
