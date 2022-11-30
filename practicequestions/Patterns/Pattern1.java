package practicequestions.Patterns;

/*

 * * * * *
 * * * *
 * * *
 * *
 *


 */
public class Pattern1 {
    public static void main(String[] args) {
//        patternOne(4);
        reversePatternOne(4);
    }

    public static void patternOne(int num)
    {
        for(int i=0; i<num; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void reversePatternOne(int num)
    {
        for(int i=num; i>=0; i--)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
