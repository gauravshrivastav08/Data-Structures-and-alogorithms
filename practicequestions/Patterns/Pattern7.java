package practicequestions.Patterns;

/*
/////////////////////////////////////

 *
   *
     *
       *
         *

/////////////////////////////////////
 */

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }

    public static void pattern7(int n)
    {
        int star = 1;
        int space = 0;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=space; j++)
                System.out.print("\t");

            for (int k=1; k<=star; k++)
                System.out.print("*\t");

            space++;
            System.out.println();
        }
    }
}
