package practicequestions.Array;

// https://www.geeksforgeeks.org/find-subarray-with-given-sum/

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int a[] = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        System.out.print("Full passed Array is { ");
        for(int val : a)
        {
            System.out.print(val + " ");
        }
        System.out.print("}");
        System.out.println();
        subArrayWithGivenSum(a,sum);
    }

    public static void subArrayWithGivenSum(int a[], int sum)
    {
        int start = 0;
        int checkSum = 0;
        int i = 0;
        int n = a.length;

        for (int j=0; j<n; j++)
        {
            if(j < n-1)
            {
                checkSum = checkSum + a[j];
            }

            while (checkSum > sum && start < j)
            {
                checkSum = checkSum - a[start];
                start++;
            }

            if(checkSum == sum)
            {
                System.out.println("Sub-Array's positions are " + start + " and " + j + " which sums the Sub-Array values to" +
                        " " + sum);
                System.out.print("Sub-Array is ");
                for (int k = start; k<=j; k++)
                {
                    System.out.print(a[k] + " ");
                }
            }
        }
    }
}
