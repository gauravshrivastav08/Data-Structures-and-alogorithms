package practicequestions.Array;

// https://www.geeksforgeeks.org/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
// Sort Zero's and One's
// using Two Pointers approach here

public class TwoPointersProblem {

    public static void main(String[] args) {
        int a[] = {0, 1, 0, 1, 1, 1,0,0,1,1,0,0,1,0,1};
        twoPointersProblem(a);

        for (int val: a)
        {
            System.out.print(val + " ");
        }
    }

    public static int[] twoPointersProblem(int a[])
    {
        int left = 0;
        int right = a.length-1;

        System.out.println("Right value is: " + right);
        while (left < right)
        {
            while (a[left] == 0 && left < right)
            {
                left++;
            }

            while (a[right] == 1 && left < right)
            {
                right --;
            }

            if(left < right) {
                a[left] = 0;
                a[right] = 1;
                left++;
                right--;
            }
        }
        return a;
    }
}
