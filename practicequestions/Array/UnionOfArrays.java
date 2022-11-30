package practicequestions.Array;

import java.util.Arrays;
import java.util.HashSet;

public class UnionOfArrays {
    public static void main(String[] args) {
        int a[] = {1 ,2, 3, 4, 5};
        int b[] = {1,2,3};
        unionOfArrays(a,a.length,b,b.length);
    }

    public static void unionOfArrays(int a[], int m, int b[], int n)
    {
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<m; i++)
        {
            hs.add(a[i]);
        }

        for (int j=0; j<n; j++)
        {
            hs.add(b[j]);
        }

        int k = hs.size();
        System.out.println("Union of Array's " + Arrays.toString(a) + " and " + Arrays.toString(b) + " is: ");
        System.out.print(hs);
        System.out.println();
        System.out.println("Size is: " + k);
    }
}
