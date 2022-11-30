package practicequestions.Array;


// Move all negative numbers to beginning and positive to end
// https://www.geeksforgeeks.org/move-negative-numbers-beginning-positive-end-constant-extra-space/

// This problem can be resolved with Quick Sort OR Two Pointers approach and for
// both Time Complexity is O(N)

public class PositiveNegativeNumbers {

    public static void main(String[] args) {
        int a[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        positiveNegativeNumbers(a);
    }

    public static void positiveNegativeNumbers(int a[])
    {
        int start = 0, temp = 0;
        int end = a.length-1;

        while(start < end)
        {
            while (a[start] < 0 && start < end)
            {
                start++;
            }

            while (a[end] > 0 && start < end)
            {
                end--;
            }

            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
        } // end of While

        for(int val : a)
        {
            System.out.print(val + " ");
        }
    }
}
