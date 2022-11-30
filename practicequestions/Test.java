package practicequestions;
import java.util.Arrays;
import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        int a[] = {6,1,15,19,9,13,12,6,7,2,10,-18,4,14,11,14,14,13,288};
        quickSort(a,0,a.length-1);
        System.out.println("Array after sort" + Arrays.toString(a));

        Scanner s1 = new Scanner(System.in);
        System.out.print("Please enter which largest element you would like to find in Array: ");
        int i = s1.nextInt();
        if(i > 0 && i < a.length)
         System.out.println(i + "th largest element in Array is " + a[i-1]);
        else
            System.out.println("Input range is not fit according to Array length, please re-assess your input");
    }

    public static void quickSort(int a[], int start, int end)
    {
        if (start<end)
        {
            int pp = partitionPoint(a, start, end);
            quickSort(a, start, pp-1);
            quickSort(a,pp+1, end);
        }
    }
    public static int partitionPoint(int a[], int start, int end)
    {
        int pivot = end;
        int i = start-1;

        for (int j=start; j<end; j++)
        {
            if(a[j] < a[pivot])
            {
                i++;
                int jval = a[j];
                int ival = a[i];
                a[j] = ival;
                a[i] = jval;
            }
        }

        int temp = a[i+1];
        a[i+1] = a[pivot];
        a[pivot] = temp;
        return i+1;
    }

}
