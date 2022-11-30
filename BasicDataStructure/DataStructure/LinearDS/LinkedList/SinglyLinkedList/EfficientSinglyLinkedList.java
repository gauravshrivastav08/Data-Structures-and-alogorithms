package dataStructure.BasicDataStructure.DataStructure.LinearDS.LinkedList.SinglyLinkedList;

class Nodee {
    int data;
    Nodee next;

    public Nodee()
    {
        this.next = null;
    }
}
public class EfficientSinglyLinkedList {

    private Nodee first;
    private Nodee last;

    public EfficientSinglyLinkedList()
    {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty()
    {
        return first==null;
    }

    public void insertFirst(int data)
    {
        Nodee node1 = new Nodee();
        node1.data = data;

        if(isEmpty())
        {
            last = node1;
        }
            node1.next = first;             // This is Linking a new node to another node which was tagged as first in past
            first = node1;
    }

    public void insertLast(int data)
    {
        Nodee node1 = new Nodee();
        node1.data = data;

        if(isEmpty())
        {
            last = node1;
        }
        else
        {
            last.next = node1;
            last = node1;
        }
    }

    public void displayList()
    {
        Nodee currentnode = first;
        System.out.println();
        System.out.println("#################################");
        System.out.println("LinkedList elements are: ");
        System.out.println("#################################");
        System.out.print("[ ");
        while(currentnode != null)
        {
            System.out.print(currentnode.data + " ");
            currentnode = currentnode.next;
        }
        System.out.println("]");
    }

    public void deleteLast()
    {
        if (isEmpty())
        {
            System.out.println("There is no Node to Delete in Linked List");
        }

        else
        {
            Nodee current_Node = first;
            Nodee current_Node_Pre = null;

            while (current_Node.next != null)
            {
                current_Node_Pre = current_Node;
                current_Node = current_Node.next;
            }

            last = current_Node_Pre;
            last.next = null;
        }
    }
}


class App8
{
    public static void main(String[] args) {
        EfficientSinglyLinkedList obj1 = new EfficientSinglyLinkedList();
        obj1.insertFirst(10);
        obj1.insertFirst(20);
        obj1.insertFirst(30);
        obj1.insertFirst(40);

        obj1.displayList();

        long start_time = System.nanoTime();
        obj1.insertLast(100);
        long end_time = System.nanoTime();
        System.out.println("Total time taken by adding an element at the end: " + (end_time-start_time) + " nano sec");
        obj1.displayList();
    }
}
