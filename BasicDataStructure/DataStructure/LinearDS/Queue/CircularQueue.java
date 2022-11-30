package dataStructure.BasicDataStructure.DataStructure.LinearDS.Queue;

public class CircularQueue {
    private int max_size;
    private int Queue_Array[];
    private int front;
    private int rear;
    private int nItems;

    public CircularQueue(int max_size)
    {
        this.max_size = max_size;
        this.Queue_Array = new int[max_size];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(int element)
    {
        try {
            if (rear == max_size - 1) {
                System.out.println("Queue is full hence inserting the records from back");
                System.out.println("Inserting " + element + " in queue");
                for(int i=0; i<max_size; i++)
                {
                    if(i==max_size-1)
                        break;
                    else
                        Queue_Array[i] = Queue_Array[i+1];
                }
                Queue_Array[Queue_Array.length-1] = element;
            }
            else {
                System.out.println("Inserting " + element + " in queue");
                rear++;
                nItems++;
                Queue_Array[rear] = element;
            }
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }

    public void display()
    {
        System.out.println("Display function called, Queue elements are: ");
        for(int i=0; i< Queue_Array.length; i++)
        {
            System.out.print(Queue_Array[i] + " ");
        }
        System.out.println();
    }

    public void remove()
    {
        try {
            if (nItems == 0) {
                System.out.println("Queue is empty");
                System.exit(0);
            }
            if (nItems == max_size - 1) {
                System.out.println("All items from Queue has been removed");
                front = 0;
            } else {
                System.out.println("##############################");
                System.out.println("Below Queue elements are getting remove:");
                System.out.println("##############################");
                System.out.print("[ ");
                while (front != max_size) {
                    int val = Queue_Array[front];
                    front++;
                    nItems--;
                    System.out.print(val + " ");
                }
                System.out.println("]");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}

class App6 {
    public static void main(String[] args) {
        CircularQueue obj1 = new CircularQueue(5);
//        obj1.remove();
        obj1.insert(10);
        obj1.insert(20);
        obj1.insert(30);
        obj1.insert(40);
        obj1.insert(50);
        obj1.display();
        obj1.insert(60);
        obj1.display();

        obj1.insert(70);
        obj1.display();
//        obj1.insert(60);

        obj1.remove();
        obj1.remove();
    }
}