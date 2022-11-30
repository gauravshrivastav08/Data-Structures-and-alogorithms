package practicequestions.Patterns;

/*
///////////////////////////////////////

           *
         *
       *
     *
   *

///////////////////////////////////////

 */
public class Pattern8
{
    public static void main(String[] args)
    {
//        pattern8(5);
        pattern8Another(5);
    }


    public static void pattern8(int n)
    {
        int star = 1;
        int space = n-1;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=space; j++)
                System.out.print("\t");

            for (int k=1; k<=star; k++)
                System.out.print("*");

            space--;
            System.out.println();
        }
    }

    public static void pattern8Another(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i+j == n+1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
