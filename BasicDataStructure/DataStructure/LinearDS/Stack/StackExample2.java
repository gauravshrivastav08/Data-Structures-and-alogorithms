package dataStructure.BasicDataStructure.DataStructure.LinearDS.Stack;

// Using Stack to reverse a passed String

public class StackExample2 {
    private int max_size;
    private Character Stack_Array[];
    private int top;

    public StackExample2(int max_size)
    {
        this.max_size = max_size;
        this.Stack_Array = new Character[max_size];
        this.top = -1;
    }

    public void push(char element)
    {
        if(top == Stack_Array.length)
        {
            System.out.println("Array is full");
            System.exit(0);
        }
        top++;
        Stack_Array[top] = element;
    }

    public void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack is already empty ");
            System.exit(0);
        }

        while(top >=0) {
            char value = Stack_Array[top];
            top--;
            System.out.println(value);
        }
    }
}

class App3 {
    public static void main(String[] args) {
        StackExample2 obj1 = new StackExample2(5);
        obj1.push('H');
        obj1.push('e');
        obj1.push('l');
        obj1.push('l');
        obj1.push('o');

        obj1.pop();
    }
}
