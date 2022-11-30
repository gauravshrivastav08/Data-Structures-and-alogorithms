package practicequestions.Linked_List;

class Node1
{
    int data;
    Node1 next;
}

class SinglyLinkedList
{
    Node1 first;
    Node1 last;

    public boolean isEmpty()
    {
        return first == null;
    }

    public void insertLast(int data)
    {
        Node1 node1 = new Node1();
        node1.data = data;

        if(isEmpty())
        {
            first = node1;
            last = node1;
        }

        else
        {
            last.next = node1;
            last = node1;
        }
    }

    public void displayList(SinglyLinkedList list)
    {
        Node1 current_node = list.first;

        while(current_node!= null)
        {
            System.out.print(current_node.data + " -> ");
            current_node = current_node.next;
        }

        System.out.println(" X" );
    }

    public void mergeLists(SinglyLinkedList l1, SinglyLinkedList l2)
    {
        SinglyLinkedList l3 = new SinglyLinkedList();

        Node1 one = l1.first;
        Node1 two = l2.first;

        while (one!=null && two!=null)
        {
            if (one.data < two.data)
            {
                l3.insertLast(one.data);
                one = one.next;
            }
            else if(two.data < one.data)
            {
                l3.insertLast(two.data);
                two = two.next;
            }
        } // End of first while

        while (one != null)
        {
            l3.insertLast(one.data);
            one = one.next;
        } // end of second while

        while (two!=null)
        {
            l3.insertLast(two.data);
            two = two.next;
        } // end of third while

        System.out.println("Merger of Two Linked Lists are: ");
        displayList(l3);
    }
}
public class MergeLinkedLists
{
        public static void main(String[] args) {
            SinglyLinkedList linkedList1 = new SinglyLinkedList();
            for(int i = 10; i<=70; i+=10)
            {
                linkedList1.insertLast(i);
            }

            System.out.println("Linked List-1 elements are: ");
            linkedList1.displayList(linkedList1);
            System.out.println();

            SinglyLinkedList linkedList2 = new SinglyLinkedList();
            for(int i = 1; i<=5; i++)
            {
                linkedList2.insertLast(i);
            }

            System.out.println("Linked List-2 elements are: ");
            linkedList2.displayList(linkedList2);
            System.out.println();

            SinglyLinkedList Obj1 = new SinglyLinkedList();
            Obj1.mergeLists(linkedList1, linkedList2);
        }
}

