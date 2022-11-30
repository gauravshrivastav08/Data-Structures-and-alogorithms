package practicequestions.Patterns;

/*

                *
           *	*
       *   *	*
    *  *   *	*
 *	*  *   *	*

 */
public class Pattern2 {
    public static void main(String[] args) {
        patternTwo(5);
    }

    public static void patternTwo(int num)
    {
        int space = num-1;
        int star = 1;
        for (int i=1; i<=num; i++)
        {
           for (int j=1; j<=space; j++)
           {
               System.out.print("\t");
           }

          for (int k=1; k<=star; k++)
          {
              System.out.print("*\t");
          }

          space--;
          star++;
          System.out.println();
        } // Main For Loop ended
    }
}
