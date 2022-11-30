package dataStructure.BasicDataStructure.Algorithm.Sorting;


public class MergeSort {

    public static void main(String[] args)
    {
        int a[] = {6,5,3,1,8,7,2,4};
        Split(a,0,a.length-1);

        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static void Split(int a[], int start, int end)
    {
      if(start < end)
      {
            int mid = (start + end)/2;
            Split(a,start,mid);
            Split(a,mid+1, end);
            merge(a,start,mid,end);
      }
    }

    public static void merge(int a[], int start, int mid, int end)
    {
        int temp[] = new int[end - start + 1];
        int k = 0;
        int leftPointer = start;
        int rightPointer = mid + 1;

        while (leftPointer<=mid && rightPointer<=end)
        {
            if(a[leftPointer] < a[rightPointer])
            {
                temp[k] = a[leftPointer];
                leftPointer++;
            }

            else {
                temp[k] = a[rightPointer];
                rightPointer++;
            }
            k++;
        }

        // It's possible that left Array has been already sorted and only right array was getting sorted
        if(leftPointer<=mid)
        {
            while (leftPointer<=mid)
            {
                temp[k] = a[leftPointer];
                leftPointer++;
                k++;
            }
        }
        else if (rightPointer<=end)
        {
            while (rightPointer<=end)
            {
                temp[k] = a[rightPointer];
                rightPointer++;
                k++;
            }
        }

        for(int i = 0; i < temp.length; i++)
        {
            a[start+i] = temp[i];
        }
    }


}
