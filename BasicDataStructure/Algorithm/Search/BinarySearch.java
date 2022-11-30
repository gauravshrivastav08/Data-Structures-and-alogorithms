package dataStructure.BasicDataStructure.Algorithm.Search;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int a[]= {10,20,30,40,50,60,70,80,90,100};
//        addNumArray(a);

        long start_time = System.currentTimeMillis();

        int search_val = 90;
       int val= binarySearch(a, search_val);
       if (val == -1)
       {
           System.out.println("Value " + search_val + " is not found in Array");
       }

       long end_time = System.currentTimeMillis();

        System.out.println("Total time take here is: " + (end_time-start_time) + " ms");

    }

    public static void addNumArray(int a[])
    {
        for (int i=0; i<10; i++)
        {
            System.out.println("Please enter the value of Array a[" + i + "]");
            Scanner s1 = new Scanner(System.in);
            int val = s1.nextInt();
            a[i] = val;
        }

        for (int value : a)
        {
            System.out.println(value);
        }
    }


    public static int binarySearch(int a[], int x)
    {
        int p = 0;
        int r = a.length-1;


        while(p<=r)
        {
            int q = (p+r)/2;

            if(a[q] == x)
            {
                System.out.println("Value " + x + " found at position a[" + q + "]");
                return q;
            }

            else if(a[q] > x)
            {
                r = q-1;
            }

            else if (a[q] < x)
            {
                p = q + 1;
            }
        }

        return -1;
    }
}
