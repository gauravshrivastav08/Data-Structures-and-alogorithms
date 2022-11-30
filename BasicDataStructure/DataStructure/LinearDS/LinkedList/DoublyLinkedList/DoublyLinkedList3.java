package dataStructure.BasicDataStructure.DataStructure.LinearDS.LinkedList.DoublyLinkedList;

// Linked list contain functions like ////////////////////////

// insertFirst, deleteFirst
// insertLast, deleteLast
// insertInBetween, deleteInBetween

class Node3 {
    int data;
    Node3 next;
    Node3 pre;
}
public class DoublyLinkedList3 {

    Node3 first;
    Node3 last;

    public boolean isEmpty()
    {
        return first == null;
    }


    public void insertFirst(int data)
    {
        Node3 Node31 = new Node3();
        Node31.data = data;

        if(isEmpty())
        {
            last = Node31;
//            first = Node31;
        }
        else
        {
            first.pre = Node31;
        }

        Node31.next = first;
        first = Node31;
    }

    public void insertLast(int data)
    {
        Node3 Node31 = new Node3();
        Node31.data = data;

        if(isEmpty())
        {
            last = Node31;
            first = Node31;
        }

        else
        {
            last.next = Node31;
        }

        Node31.pre = last;
        last = Node31;
    }

    public void deleteFirst()
    {
        if(isEmpty())
        {
            System.out.println("There is no Node3 to delete in LinkedList !!");
        }

        else
        {
            Node3 temp = first;
            first = first.next;
            first.pre = null;
            temp.next = null;
        }
    }


    public void deleteLast()
    {
        if (isEmpty())
        {
            System.out.println("There is nothing to delete in last in LinkedList !!");
        }

        else {
            last = last.pre;
            last.next = null;
        }
    }
    public void displayList()
    {
        System.out.println();
        System.out.println("###########################");
        System.out.println("LinkedList elements are: ");
        System.out.println("###########################");
        Node3 current_Node3 = first;
        while (current_Node3!=null)
        {
            System.out.print(current_Node3.data + " ");
            current_Node3 = current_Node3.next;
        }
        System.out.println();
    }

    public void insertInBetween(int data)
    {
        Node3 Node31 = new Node3();
        Node31.data = data;

        if(isEmpty())
        {
            last = Node31;
            System.out.println("There is no pre existing Node3 in LinkedList");
        }

        else
        {
            int count = 0;
//            Node3 temp2 = null;
            Node3 current_Node3 = first;
            while(current_Node3 != null)
            {
                count++;
                current_Node3 = current_Node3.next;
            }

            int middle = count/2;

            Node3 temp1 = first;
            int Node3finder = 1;
            while(Node3finder != middle)
            {
                Node3finder++;
                temp1 = temp1.next;
            }

            System.out.println("Node3 finder value is: " + Node3finder);
            Node3 temp2 = temp1.next;
//            temp1 = temp2.pre;

            temp1.next = Node31;
            Node31.pre = temp1;
            temp2.pre = Node31;
            Node31.next = temp2;
        }
    }


    public void deleteInBetween()
    {
        if (isEmpty())
        {
            System.out.println("LinkedList is empty and nothing to delete over there !!");
        }

        else
        {
            int count = 0;
            Node3 current_Node3 = first;
            while(current_Node3!=null)
            {
                count++;
                current_Node3 = current_Node3.next;
            }

            int middle = count/2;

            int Node3finder = 1;
            Node3 temp1 = first;
            while(Node3finder != middle)
            {
                Node3finder++;
                temp1 = temp1.next;
            }

            Node3 temp2 = temp1.next.next;
            temp1.next = temp2;
            temp2.pre = temp1;
        }
    }

    public static void main(String[] args)
    {
        DoublyLinkedList3 Obj1 = new DoublyLinkedList3();
        Obj1.insertFirst(10);
        Obj1.insertFirst(20);
        Obj1.insertFirst(30);
        Obj1.insertFirst(40);
        Obj1.insertFirst(50);

        Obj1.displayList();

//        Obj1.deleteFirst();
//        Obj1.displayList();
//
//        Obj1.deleteLast();
//        Obj1.displayList();

//        Obj1.insertLast(60);
//        Obj1.insertLast(70);
//        Obj1.insertLast(80);
//        Obj1.insertLast(90);
//        Obj1.insertLast(100);
//        Obj1.displayList();

        Obj1.insertInBetween(35);
        Obj1.displayList();

        Obj1.deleteInBetween();
        Obj1.displayList();
    }


}
