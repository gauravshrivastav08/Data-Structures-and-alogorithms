package practicequestions.Array;

import java.util.Arrays;

public class CircularArray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        System.out.println("Original Arrays is: " + Arrays.toString(a));
        circularArray(a);
    }

    public static void circularArray(int a[])
    {
        int x = a[a.length-1];

        for(int i=a.length-1; i>0; i--)
        {
            a[i] = a[i-1];
        }

        a[0] = x;

        System.out.println("Circular Array is: " + Arrays.toString(a));
    }
}
