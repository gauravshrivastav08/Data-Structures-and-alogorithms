package practicequestions.Array;

// This problem can be resolved by 2 Pointers problem

import java.util.Arrays;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int a[] = {1 ,2, 3, 4, 5};
        int b[] = {1,2,3};
        System.out.println("Intersection of Array " + Arrays.toString(a) + " and " +  Arrays.toString(b) + " are: ");
        System.out.print("[ ");
        intersectionOfArrays(a,a.length,b,b.length);
        System.out.print("]");
    }

    public static void intersectionOfArrays(int a[], int m, int b[], int n)
    {
        int i=0;
        int j=0;

        while (i < m && j < n)
        {
            if(a[i] < b[j])
                i++;
            else if(a[i] > b[j])
                j++;
            else
            {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        } // end of while
    }
}
