package practicequestions.Array;

// Return more than 2 Values through a function in JAVA

public class MinMaxElement {
    int min;
    int max;
    public MinMaxElement(int min, int max)
    {
        this.min = min;
        this.max = max;
    }

    public static void main(String[] args) {
        int a[] = {10,45,-19,100,-18,1026};
        MinMaxElement Obj1 = getMinMax(a,a.length);
        System.out.println("Min value is: " + Obj1.min);
        System.out.println("max value is: " + Obj1.max);
    }

    public static MinMaxElement getMinMax(int a[], int n)
    {
        int min = a[0];
        int max = a[0];

        for (int i=0; i<n; i++)
        {
            if(a[i] > max)
            {
                max = a[i];
            }

            else if(a[i] < min)
            {
                min = a[i];
            }
        } // end of for loop
        return new MinMaxElement(min, max);
    }
}
