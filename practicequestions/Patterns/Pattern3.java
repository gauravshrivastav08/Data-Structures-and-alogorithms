package practicequestions.Patterns;

/*


 *	*	*	*	*
    *	*	*	*
        *	*	*
            *	*
                *
 */

public class Pattern3 {
    public static void main(String[] args) {
        pattern3(5);
    }

    public static void pattern3(int num)
    {
        int star = num;
        int space = 1;

        for(int i=1; i<=num; i++)
        {
            for (int j=1; j<space; j++)
                System.out.print("\t");

            for(int k=1; k<=star; k++)
                System.out.print("*\t");

            star--;
            space++;
            System.out.println();
        }
    }
}
