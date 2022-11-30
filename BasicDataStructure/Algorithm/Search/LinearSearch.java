package dataStructure.BasicDataStructure.Algorithm.Search;

import java.util.Scanner;

public class LinearSearch {
    static int max_size;
    public static void main(String[] args) {


        Scanner s1 = new Scanner(System.in);
        System.out.println("Please enter the Array Size");
        max_size = s1.nextInt();

        int a[] = new int[max_size];
        insertArrayValues(a,max_size);

        System.out.println("Please enter the value which you want to search");
        Scanner s3 = new Scanner(System.in);
        int search_val = s3.nextInt();

        int ans = arrayValues(a,max_size,search_val);
        if(ans == -1)
        {
            System.out.println(search_val + " is not found in Array");
        }
    }

    public static void insertArrayValues(int a[], int max_size)
    {
        for (int i=0; i<max_size; i++)
        {
            System.out.println("Please enter the Array value a[" + i +"] : ");
            Scanner s2 = new Scanner(System.in);
            int val = s2.nextInt();
            a[i] = val;
        }
    }

    public static int arrayValues(int a[],int max_size, int search_val)
    {
        int answer=-1;
        for(int i=0; i<max_size; i++)
        {
            if(a[i] == search_val)
            {
                System.out.println("We found the value " + search_val + " at a[" + i +"] position in Array");
                answer = i;
                return answer;
            }
        }
        return answer;
    }
}
