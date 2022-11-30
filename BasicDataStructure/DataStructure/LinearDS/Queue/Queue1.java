package dataStructure.BasicDataStructure.DataStructure.LinearDS.Queue;

// Queue in background also uses Array

public class Queue1 {
    private int max_size;
    private int Queue_Array[];
    private int front;
    private int rear;
    private int nItems;

    public Queue1(int max_size)
    {
        this.max_size = max_size;
        Queue_Array = new int[max_size];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int element)
    {
        if(rear == max_size-1)
        {
            System.out.println("Queue has been full");
        }
        else {
            rear++;
            Queue_Array[rear] = element;
            nItems++;
        }
    }

    public void remove()
    {
        if(front == max_size)
        {
            System.out.println("All the elements in Queue has been removed");
            front = 0;
        }

       else if (rear == -1)
        {
            System.out.println("There is no items in queue");
        }
        else
        {
            System.out.println("################################");
            System.out.println("Queue elements are: ");
            System.out.println("################################");

            System.out.print("[ ");
            while(front != max_size) {
                int temp = Queue_Array[front];
                front++;
                nItems--;
                System.out.print(temp + " ");
            }
            System.out.print("]");
            System.out.println();
            System.out.println();
        }

    }
}

class App5 {
    public static void main(String[] args) {
        Queue1 obj1 = new Queue1(5);
        obj1.remove();

        obj1.insert(10);
        obj1.insert(20);
        obj1.insert(30);
        obj1.insert(40);
        obj1.insert(50);
        obj1.insert(60);

        obj1.remove();

        obj1.remove();
    }
}
