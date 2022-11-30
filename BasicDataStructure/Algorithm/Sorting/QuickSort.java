package dataStructure.BasicDataStructure.Algorithm.Sorting;

// Quick sort is useful in case there is a space constraint otherwise
// Merge sort is a best choice

public class QuickSort {

    public static void main(String[] args) {
//        int a[] = {6,1,15,19,9,13,12,6,7,2,10,-18,4,1,14,11,14,14,13,288};
          int a[] = {24 ,18, 38, 43, 14 ,40, 1, 54};
        quickSort(a,0,a.length-1);

        for(int val : a)
        {
            System.out.print(val + " ");
        }
    }

    public static void quickSort(int a[], int start, int end)
    {
        if(start < end)
        {
            int pp = partition(a,start,end);             // pp is a partitioning point
            quickSort(a,start,pp-1);
            quickSort(a,pp+1,end);
        }
    }

    public static int partition(int a[], int start, int end)
    {
        int pivot = a[end];
        int i = start-1;

        for(int j= start; j<=end-1; j++)
        {
            if (a[j] <= pivot) {
                i++;
                int ival = a[i];
                int jval = a[j];
                a[i] = jval;
                a[j] = ival;
            }
        }

        int temp = a[i+1];
        a[i+1] = pivot;
        a[end] = temp;
        return i+1;
    }
}
