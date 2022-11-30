package dataStructure.BasicDataStructure.DataStructure.LinearDS.LinkedList.DoublyLinkedList;

class Node1 {
    int data;
    Node1 next;
    Node1 pre;
}

class DoublyLinkedList2 {
    Node1 first;
    Node1 last;

    public DoublyLinkedList2()
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
        Node1 node1 = new Node1();
        node1.data = data;

        if(isEmpty())
        {
            last = node1;
            node1.next = first;
            node1.pre = null;
        }

        else {
            node1.next = first;
            first.pre = node1;
        }

        first = node1;

    }

    public void insertLast(int data)
    {
        Node1 node1 = new Node1();
        node1.data = data;

        if (isEmpty())
        {
            last = node1;
            node1.next = first;
            node1.pre = null;
        }

        last.next = node1;
        node1.pre = last;
        last = node1;
    }

    public void displayList()
    {
        System.out.println();
        System.out.println();
        System.out.println("###################################");
        System.out.println("Doubly LinkedList elements are: ");
        System.out.println("###################################");
        System.out.print("[ ");
        Node1 current_node = first;
        while(current_node !=null)
        {
            System.out.print(current_node.data + " ");
            current_node = current_node.next;
        }
        System.out.print("]");
    }

    public void deleteFirst()
    {
        Node1 temp = first;
        first = first.next;
        first.pre = null;
        System.out.println();
        System.out.println("Deleting " + temp.data + " from Doubly LinkedList");
    }

    public void deleteLast()
    {
        System.out.println();
        System.out.println("Deleting " + last.data + " from DoublyLinkedList");
        last = last.pre;
        last.next = null;
    }

    public void insertInbetween(int data)
    {
        System.out.println();
        System.out.println("Entering into InbetweenInsert Loop");
        Node1 node1 = new Node1();
        node1.data = data;

        Node1 current_node = first;
        while (current_node.data != 20)
        {
            System.out.println("Entering into While Loop");
            current_node = current_node.next;
        }
        if (current_node.data == 20)
        {
            Node1 temp = current_node.next;
            current_node.next = node1;
            node1.pre = current_node;
            node1.next = temp;
            temp.pre = node1;
        }
    }

    public void deleteInbetween()
    {
        Node1 current_node = first;
        while(current_node.data !=1000)
        {
            current_node = current_node.next;
        }

        if(current_node.data == 1000)
        {
           Node1 temp1 = current_node.pre;
            Node1 temp2 = current_node.next;

            temp1.next = temp2;
            temp2.pre = temp1;
        }
    }

}

public class DoublyLinkedList22 {

    public static void main(String[] args) {
        DoublyLinkedList2 Obj1 = new DoublyLinkedList2();
        Obj1.insertFirst(10);
        Obj1.insertFirst(20);
        Obj1.insertFirst(30);
        Obj1.insertFirst(40);
        Obj1.insertFirst(50);

        Obj1.displayList();

        Obj1.insertLast(100);
        Obj1.displayList();

        Obj1.deleteFirst();
        Obj1.displayList();

        Obj1.deleteLast();
        Obj1.displayList();

        Obj1.insertInbetween(1000);
        Obj1.displayList();

        Obj1.deleteInbetween();
        Obj1.displayList();
    }

}
