//package dataStructure.BasicDataStructure.DataStructure.LinearDS.Stack;
//
//public class Stack<I extends Number> {
//    private int max_size;
//    private int Stack_Array[];
//    private int top;
////
////    public Stack()
////    {
////        this.max_size = max_size;
////        Stack_Array = new int[max_size];
////        this.top = -1;
////    }
//
//    public void push(int element)
//    {
//        try {
////        System.out.println("Top value is: " + top);
//            if (top == Stack_Array.length) {
//                int val = Stack_Array.length - 1;
//                System.out.println("Stack size defined is Stack_Array[" + val + "] and it" +
//                        " is full, can't enter further elements");
//                System.exit(0);
//            }
//            top++;
//            Stack_Array[top] = element;
//        }
//
//        catch(Exception e)
//        {
//            System.out.println(e.toString());
//        }
//    }
//
//    public void pop()
//    {
//        if(top == -1)
//        {
//            System.out.println("There is nothing in Stack to Pop out, please push the elements first");
//            System.exit(0);
//        }
//
//        System.out.println("#####################################");
//        System.out.println("Popping out Stack values: ");
//        System.out.println("#####################################");
//
//        while(top >=0) {
//            int old_top = Stack_Array[top];
//            top--;
//            System.out.println(old_top);
//        }
//    }
//
//    public void peak()
//    {
//        if(top == -1)
//        {
//            System.out.println("There is no element in Stack and its empty");
//            System.exit(0);
//        }
//        System.out.println("Peak of Stack is: " + Stack_Array[top]);
//    }
//}
//
//class App1 {
//    public static void main(String[] args) {
//        Stack<Number> obj1 = new Stack<Number>();
////        obj1.peak();
////        obj1.pop();
//
//        obj1.push(10);
//        obj1.push(20);
//        obj1.push(30);
//        obj1.push(40);
//        obj1.push(50);
////        obj1.push(60);
//        obj1.peak();
//
//        obj1.pop();
//    }
//}