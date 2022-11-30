package dataStructure.BasicDataStructure.Algorithm.Search;

public class RecursiveBinarySearch {

    public static void main(String[] args) {

        int a[] = {10,20,30,40,50,60,70,80,90,100};
        long start_time = System.currentTimeMillis();
        recursiveBinarySearch(a,0,a.length-1,90);
        long end_time = System.currentTimeMillis();
        System.out.println("Total time take here is: " + (end_time-start_time) + " ms");
    }

    public static int recursiveBinarySearch(int a[], int p, int r, int search_val)
    {
        int q = (p+r)/2;

        if(p > r)
        {
            System.out.println("Unable to find the value in Array");
            return -1;
        }
        else if (a[q] == search_val)
        {
            System.out.println("Value " + search_val + " found at " + q + " position in Array");
            return q;
        }
       else if (search_val < a[q])
        {
            return recursiveBinarySearch(a,p, q-1,search_val);
        }
        else {
            return recursiveBinarySearch(a, q+1, r, search_val);
        }

    }
}


