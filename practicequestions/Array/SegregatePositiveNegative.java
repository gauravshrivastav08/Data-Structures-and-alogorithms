package practicequestions.Array;
import java.util.Arrays;

// Segregate negative and positive numbers of a given Array
// without changing the Input Order

// This problem can be sort in other ways as well if order of element is
// not an issue, techniques could be used here is:
// Quick Sort, Two Pointers

public class SegregatePositiveNegative {
    public static void main(String[] args) {
        int a[]= {1, -1, 3, 2, -7, -5, 11, 6};
        System.out.println(Arrays.toString(a));
        segregatePositiveNegative(a,a.length);
        System.out.println(Arrays.toString(a));
    }
   public static void segregatePositiveNegative(int a[], int n)
    {
        // This is not an Optimized Solution because it's not only using an extra space
        // of newly created Array temp[] but also using 2 loops which increasing it's time complexity
        // And space of new Array is increasing its space complexity i.e. Auxiliary Space

        int j=0;
        int temp [] = new int[n];

        // Put the positive numbers in temp Array
        for(int i=0; i<n; i++)
        {
            if(a[i] > 0)
            {
                temp[j] = a[i];
                j++;
            }
        } // end of first For loop

        // Put the negative numbers in Temp Array
        for(int i=0; i<n; i++)
        {
            if(a[i] < 0)
            {
                temp[j] = a[i];
                j++;
            }
        } // end of second For loop

        // Copy the Temp Array to Original Array
        for (int i=0; i<n; i++)
        {
            a[i] = temp[i];
        } // End of 3rd For loop
    }
}
