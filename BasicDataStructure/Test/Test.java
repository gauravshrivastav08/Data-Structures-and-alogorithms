package dataStructure.BasicDataStructure.Test;

// int arr[] = {300,34,-20,45,1,-10};

import java.util.Arrays;

public class Test {

    // Driver code
    public static void main(String arg[])
    {
        int array[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        int n = array.length;
        System.out.println(Arrays.toString(array));
        segregateElements(array, n);
        System.out.println(Arrays.toString(array));
    }

    public static void segregateElements(int array[], int length)
    {
        int temp[] = new int[length];
        int pos = 0, neg = length - 1;

        for (int i = 0; i < length; i++)
        {
            if (array[length - 1 - i] < 0)
            {
                temp[neg] = array[length - 1 - i];
                neg--;
            }
            if (array[i] >= 0)
            {
                temp[pos] = array[i];
                pos++;
            }
        } // end of for loop

        for(int i=0; i<length; i++)
        {
            array[i] = temp[i];
        }
    }

}

