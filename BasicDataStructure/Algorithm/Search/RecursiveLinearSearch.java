package dataStructure.BasicDataStructure.Algorithm.Search;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int a[] = {0,1,2,3,4,5};

        long start_time = System.currentTimeMillis();

        int b = recursivelinearSearch(a,5,0);
        if(b == -1)
        {
            System.out.println("Passed value is not found in Array");
        }

        long end_time = System.currentTimeMillis();

        System.out.println("Total time take here is: " + (end_time - start_time));
    }

    public static int recursivelinearSearch(int a[], int search_val,int i)
    {
           if(i == a.length)
           {
               return -1;
           }

           else  if (a[i] == search_val)
            {
                System.out.println(search_val + " has been found at a[" + i + "] th position in Array");
                return i;
            }

            else
            {
                return recursivelinearSearch(a, search_val, i + 1);
            }
    }
}