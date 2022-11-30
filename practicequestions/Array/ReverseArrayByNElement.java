package practicequestions.Array;
import java.util.Arrays;

public class ReverseArrayByNElement {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        System.out.println("Original Array is:    " + Arrays.toString(a));
//        reverseArrayByKthElement(a,4);
//        System.out.println("Array after rotation: " + Arrays.toString(a));
        reverseArrayByKthElement(a,1);
        System.out.println("Array after rotation: " + Arrays.toString(a));
    }

    public static void reverseArrayByKthElement(int a[], int k)
    {
        k = k % a.length;
        if(k < 0)
            k = k + a.length;

        // part 1 reverse
        reverseArray(a,0,a.length-k-1);

        // part 2 reverse
        reverseArray(a,a.length-k,a.length-1);

        // All reverse
        reverseArray(a,0,a.length-1);
    }

    public static void reverseArray(int a[], int i, int j)
    {
        int li = i;
        int ri = j;

        while (li < ri)
        {
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }
    }


}
