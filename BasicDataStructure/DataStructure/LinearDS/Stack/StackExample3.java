package dataStructure.BasicDataStructure.DataStructure.LinearDS.Stack;

// Reverse a passed String

public class StackExample3 {
    private int max_size;
    private Character Stack_Array[];
    private int top;

    public StackExample3(int max_size)
    {
        this.max_size = max_size;
        this.Stack_Array = new Character[max_size];
        this.top = -1;
    }

    public void push(char element)
    {
        if(top == Stack_Array.length)
        {
            System.out.println("Array is already full, can't insert more values");
        }
        else {
            top++;
            Stack_Array[top] = element;
        }
    }

    public void pop(String str1)
    {
        if(top == -1)
        {
            System.out.println("There is no element in stack");
        }

        else {
            String reverse = "";                // Empty String need to be defined here
            while(top >=0) {
                char ch = Stack_Array[top];
                reverse = reverse + ch;
                top--;
            }
            System.out.println("Reverse of String " + str1 +  " is: " + reverse);
        }
    }
}

class App4 {
    public static void main(String[] args) {

        reverseString("POP");
    }

    public static void reverseString(String str)
    {
        StackExample3 obj1 = new StackExample3(str.length());
        for(int i=0 ; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            obj1.push(ch);
        }

        obj1.pop(str);
    }
}
