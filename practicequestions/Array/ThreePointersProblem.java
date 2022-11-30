package practicequestions.Array;

// https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
// https://www.javatpoint.com/sort-an-array-of-0s-1s-and-2s
// This is also called as Dutch national flag problem

// Using 3 Pointers approach here:

public class ThreePointersProblem {

    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        threePointersProblem(arr,arr.length);

        for (int val: arr)
        {
            System.out.print(val + " ");
        }
    }

    public static void threePointersProblem(int a[], int size)
    {
        int low = 0;
        int mid = 0;
        int high = size-1;
        int temp = 0;

        while (mid <= high)
        {
            switch (a[mid])
            {
                case 0: {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                }

                case 1: {
                    mid++;
                    break;
                }

                case 2: {
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                    break;
                }
            } // end of Switch
        } // End of While
    }
}
