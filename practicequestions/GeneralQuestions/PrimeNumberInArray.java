package practicequestions.GeneralQuestions;

import java.util.Arrays;

public class PrimeNumberInArray {
    public static void main(String[] args) {
        int a[] = {1,3,5,6,7,9,10,12,13};
        System.out.println("Passed Array is: " + Arrays.toString(a));
        findPrimeNumber(a);
    }

    public static void findPrimeNumber(int a[])
    {
        int length = a.length;


        for(int i=0; i<length; i++)
        {
            boolean isPrime = true;

            for(int j=2; j<(a[i]/2); j++)
            {
                if(a[i] % j == 0)
                {
                    isPrime = false;
                    break;
                }
            } // end of inner loop

        if(isPrime)
            System.out.println(a[i] + " is a Prime number");
        }// end of outer loop
    }
}
