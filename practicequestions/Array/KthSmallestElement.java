package practicequestions.Array;

// In a given Array find a kth smallest element
/*
Example:

Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given array is 7.
 */

// We'll use a concept of Quick Sort here

public class KthSmallestElement {

    public static void main(String[] args) {
        int a[] = {6,1,15,19,9,13,12,6,7,2,10,-18,4,14,11,14,14,13,288};
        int k = 3;

        int b[] = quickSort(a,0,a.length-1);
        System.out.println("Sorted Array is: " );
        for (int val : b)
        {
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println(k + "rd smallest element in Array is: " + b[k-1]);
    }

    public static int[] quickSort(int a[], int start, int end)
    {
        if(start < end)
        {
            int pp = partition(a, start, end);
            quickSort(a,start, pp-1);
            quickSort(a,pp+1, end);
        }
        return a;
    }


    public static int partition(int a[], int start, int end)
    {
        int pivot = a[end];
        int i = start-1;

        for(int j=start; j<=end-1; j++)
        {
            if(a[j] <= pivot)
            {
                i++;
                int ival = a[i];
                int jval = a[j];

                a[i] = jval;
                a[j] = ival;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[end];
        a[end] = temp;
        return i+1;
    }
}
