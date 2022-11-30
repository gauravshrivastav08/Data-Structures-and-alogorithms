package practicequestions.Patterns;

/*

 *	*	*			*	*	*
 *	*					*	*
 *							*
 *	*					*	*
 *	*	*			*	*	*

 */

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(5);
    }

    public static void pattern6(int n)
    {
        int star = (n/2)+1;
        int space = n/2;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=star; j++)
                System.out.print("*\t");

            for (int k=1; k<=space; k++)
                System.out.print("\t");

            for(int j=1; j<=star; j++)
                System.out.print("*\t");
            System.out.println();

            if(i<=n/2)
            {
                star--;
                space+=2;
            }

            else
            {
                star++;
                space-=2;
            }
        }
    }
}
