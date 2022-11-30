package practicequestions.Stack;

// In this program try to find a maximum number in a given sub-array window
/*Input: arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6}, K = 3
        Output: 3 3 4 5 5 5 6
        Explanation: Maximum of 1, 2, 3 is 3
        Maximum of 2, 3, 1 is 3
        Maximum of 3, 1, 4 is 4
        Maximum of 1, 4, 5 is 5
        Maximum of 4, 5, 2 is 5
        Maximum of 5, 2, 3 is 5
        Maximum of 2, 3, 6 is 6
*/

// https://www.geeksforgeeks.org/sliding-window-maximum-maximum-of-all-subarrays-of-size-k/

// Sliding Window Maximum | Solution by Pepcoding: https://www.youtube.com/watch?v=tCVOQX3lWeI

import java.util.Stack;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int a[] = {1, 2, 3,   1, 4, 5,  2, 3, 6};
        int k=3;
        maxInSubArray(a,k);
    }

    public static void maxInSubArray(int a[], int k)
    {
        int nge[] = new int[a.length];
        Stack<Integer> st = new Stack<>();
        st.push(a.length-1);
        nge[a.length-1] = a.length;

        // This loop would help to find next greatest element
        // This is a 3 step process->  pop, find an ans, push [-, a, +]
        for (int i=a.length-2 ; i>=0; i--)
        {
            while (st.size() > 0 && a[i] >= a[st.peek()])
            {
                st.pop();
            }

            if(st.size() == 0)
            {
                nge[i] = a.length;
            }
            else
            {
                nge[i] = st.peek();
            }

            st.push(i);

        } // end of for loop

        for(int i=0; i<=a.length-k; i++)
        {
            int j = i;
            while (nge[j] < i+k)
            {
                j = nge[j];
            }
            System.out.print(a[j] + " ");
        }
    }
}
