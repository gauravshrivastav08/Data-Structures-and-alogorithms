package practicequestions.Array;

// In this Program we're using Two Pointer technique
// Time Complexity is O(N)
// Space Complexity is O(N)

import java.util.Arrays;

public class SegregatePositiveNegativeEfficient {
    public static void main(String[] args) {
        int a[]= {1, -1, 3, 2, -7, -5, 11, 6};
        System.out.println(Arrays.toString(a));
        segregatePositiveNegativeEfficient(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    public static void segregatePositiveNegativeEfficient(int a[], int n)
    {
        int start = 0, end = a.length-1;
        int temp[] = new int[n];

        for(int i=0; i<n; i++)
        {
            if(a[n-1-i] < 0)
            {
                temp[end] = a[n-1-i];
                end--;
            }

            if(a[i] > 0)
            {
                temp[start] = a[i];
                start++;
            }
        } // end of for loop

        for(int i=0; i<n; i++)
        {
            a[i] = temp[i];
        }
    }
}
