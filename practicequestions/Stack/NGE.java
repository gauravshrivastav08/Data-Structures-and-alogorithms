package practicequestions.Stack;

// Sliding Window Technique
// Find next greater element in a Stack
// pop, ans, push

import java.util.Stack;

public class NGE {

    public static void main(String[] args) {

        int arr[] = {4 , 5 , 2 , 25};
        nextGreaterElement(arr);
    }

    public static void nextGreaterElement(int a[])
    {
        int nge[] = new int[a.length];
        Stack<Integer> st = new Stack<>();
        System.out.println("Stack Size is: " + st.size());
        System.out.println();
        st.push(a[a.length-1]);
        nge[a.length-1] = -1;

        for (int i=a.length-2; i>=0; i--)
        {
            while(a[i] >= st.peek() && st.size() > 0)
            {
                st.pop();
            }

            if(st.size() == 0)
            {
                nge[i] = -1;
            }
            else
            {
                nge[i] = st.peek();
            }

            st.push(a[i]);
        }

        for (int i=0; i<a.length; i++)
        {
            System.out.println(a[i] + " : " + nge[i]);
        }
    }
}
