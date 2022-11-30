package dataStructure.BasicDataStructure.DataStructure.LinearDS.LinkedList.DoublyLinkedList;

class Node{
    int data;
    Node next;
    Node pre;
}
public class DoublyLinkedList1 {
    private Node first;
    private Node last;

    public DoublyLinkedList1()
    {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public void insertFirst(int data)
    {
        Node node1 = new Node();
        node1.data = data;

        if(isEmpty())
        {
            last = node1;
        }
        else
        {
            node1 = first.pre;
        }

        node1.next = first;
        first = node1;
    }

    public void insertLast(int data)
    {
        Node node1 = new Node();
        node1.data = data;

        if(isEmpty())
        {
            last = node1;
            last.next = first;
            last.pre = null;
        }
        else
        {
            last = node1.pre;
            last.next = node1;
        }
    }


    public void displayList()
    {
        Node current_node = first;
        System.out.print("[ ");
        while(current_node != null)
        {
            System.out.print(current_node.data + " ");
            current_node = current_node.next;
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        DoublyLinkedList1 O1 = new DoublyLinkedList1();
        O1.insertFirst(10);
        O1.insertFirst(20);
        O1.insertFirst(30);

        O1.displayList();
    }
}

