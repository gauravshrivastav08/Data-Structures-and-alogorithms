package dataStructure.BasicDataStructure.DataStructure.LinearDS.LinkedList.SinglyLinkedList;

class Node {
    int data;
    Node next = null;
}

public class SinglyLinkedList {
   private Node first;

   public void insertFirst(int data)
   {
       System.out.println("Inserting element " + data + " into LinkedList");
       Node node1 = new Node();
       node1.data = data;
       node1.next = first;
       first = node1;
   }

   public Node deleteFirst()
   {
       System.out.println("Deleting the element from its starting position");
       if (first == null)
       {
           System.out.println("LinkedList is empty");
           System.exit(0);
       }
       Node temp = first;
       first = first.next;
       System.out.println("Deleting " + temp.data + " from LinkedList");
       return temp;
   }

   public void insertLast(int data)
   {
       System.out.println();
       System.out.println("Inserting an element " + data + " at last in LinkedList");
       Node currentnode = first;
       while (currentnode.next != null)
       {
         currentnode = currentnode.next;
       }
       Node newnode = new Node();
       newnode.data = data;
       currentnode.next = newnode;
   }

   public void displayList()
   {
       System.out.println();
       System.out.println("##########################");
       System.out.println("LinkedList elements are: ");
       System.out.println("##########################");
       System.out.print("[ ");
       Node currentnode = first;
       while(currentnode != null)
       {
           System.out.print(currentnode.data + " ");
           currentnode = currentnode.next;
       }
       System.out.print("]");
       System.out.println();
       System.out.println();
   }

   public void deleteLast()
   {
       if(first == null)
       {
           System.out.println("Nothing to delete");
           System.exit(0);
       }
       Node currentnode;
       currentnode = first;
       Node temp = null;
       while(currentnode.next !=null)
       {
           temp = currentnode;
           currentnode = currentnode.next;
       }
       temp.next = null;
   }
}


class App7{
    public static void main(String[] args) {
        SinglyLinkedList obj1 = new SinglyLinkedList();
//        obj1.deleteFirst();
        obj1.insertFirst(10);
        obj1.insertFirst(20);
        obj1.insertFirst(30);
        obj1.insertFirst(40);
        obj1.insertFirst(50);

        obj1.displayList();

        long start_time = System.nanoTime();
        obj1.insertLast(100);
        long end_time = System.nanoTime();
        System.out.println("Total time taken by adding an element at the end: " + (end_time-start_time) + " nano sec");
    }
}
