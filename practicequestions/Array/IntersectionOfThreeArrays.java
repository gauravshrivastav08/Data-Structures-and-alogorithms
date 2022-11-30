package practicequestions.Array;

public class IntersectionOfThreeArrays {

    public static void main(String[] args) {
       int a1[] = {1, 5, 5};
       int a2[] = {3, 4, 5, 5, 10};
       int a3[] = {5, 5, 10, 20};
       intersectionOfThreeArrays(a1,a2,a3);
    }

    public static void intersectionOfThreeArrays(int a[], int b[], int c[])
    {
        int i=0, j=0, k=0;

        while (i < a.length && j < b.length && k < c.length)
        {
            if(a[i] < b[j] || a[i] < c[k])
                i++;
            else if (b[j] < a[i] || b[j] < c[k])
                j++;
           else if(c[k] < b[j] || c[k] < a[i])
               k++;
           else
            {
                System.out.print(a[i] + " ");
                i++;
                j++;
                k++;
            }
        }
    }
}
