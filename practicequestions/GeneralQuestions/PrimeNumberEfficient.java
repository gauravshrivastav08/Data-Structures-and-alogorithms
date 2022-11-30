package practicequestions.GeneralQuestions;

public class PrimeNumberEfficient {
    public static void main(String[] args) {
        int a[] = {1,3,2,5,7,0,19,17,18,66,50};
        findPrimeNumber(a);
    }

    public static void findPrimeNumber(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            boolean isPrime = true;
            for(int div=2; div*div<=a[i]; div++)
            {
                if(a[i]%div == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime)
                System.out.println(a[i] + " is a Prime Number");
            else
                System.out.println(a[i] + " is NOT a PRIME Number");
        }
    }
}
