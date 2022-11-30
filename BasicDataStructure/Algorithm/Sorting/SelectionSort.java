package dataStructure.BasicDataStructure.Algorithm.Sorting;

// Algo complexity of Selection Sort is O(n^2)

public class SelectionSort {
    public static void main(String[] args) {

        int a[] = {50,30,80,20,10,100,85};
        int b[] = selectionSort(a);

        for(int val : b)
        {
            System.out.println(val);
        }
    }

    public static int[] selectionSort(int a[])
    {
        for (int i = 0; i < a.length; i++)
        {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[j] < a[min])
                {
                    min = j ;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
       }
        return a;
    }
}
