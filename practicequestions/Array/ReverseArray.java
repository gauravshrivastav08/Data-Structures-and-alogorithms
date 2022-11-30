package practicequestions.Array;

import java.util.Scanner;

public class ReverseArray
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            int testcase=sc.nextInt(); // No of test cases you want to test i.e. reverse multiple Arrays
            while(testcase>0)
            {
                int n=sc.nextInt();
                int a[]=new int[n];
                for(int i=0;i<n;i++)
                {
                    a[i]=sc.nextInt();
                }
                for(int i=n-1;i>=0;i--)
                {
                    System.out.print(a[i]+" ");
                }
                System.out.println();
                testcase--;
            }
    }
}
