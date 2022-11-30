package practicequestions.Array;

import java.util.Arrays;

public class ArrayInverse {
    public static void main(String[] args) {
        int a[] = {4,1,0,2,3};
        System.out.println("Array before inversion: " + Arrays.toString(a));
        arrayInverse(a);
    }

    public static void arrayInverse(int a[])
    {
        int inverse[] = new int[a.length];

        for(int i=0; i<a.length; i++)
        {
            int v = a[i];
            inverse[v] = i;
        }
        System.out.println("Array after Inversion: " + Arrays.toString(inverse));
    }
}
