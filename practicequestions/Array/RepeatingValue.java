package practicequestions.Array;

public class RepeatingValue {

    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        int x = 2;
        int c = repeatingValue(arr, 2);
        System.out.println("Value of C is: " + c);
    }
    public static int repeatingValue(int a[], int x)
    {
        int a_copy[] = new int[a.length];
        int ref= 0;
        int visited = -1;
        for(int i=0; i<a.length; i++)
        {
            int count = 1;
            for(int j=i+1; j<a.length; j++)
            {
                if (a[i] == a[j])
                {
                    count++;
                    a_copy[j] = visited;
                }
            }

                if(a_copy[i]!=visited) {
                    a_copy[i] = count;
                }

        } // end of for loop

        for(int i=0; i<a_copy.length; i++)
        {
            if(a_copy[i] !=visited && a[i] == x) {
                System.out.println(a[i] + " : " + a_copy[i]);
                ref = a_copy[i];
            }
        }
        return ref;
    }
}


