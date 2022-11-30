package practicequestions.Linked_List;

class Node
{
    int data;
    Node next;
}

public class SinglyLinkedListMiddle {
    Node first;
    Node last;

    public SinglyLinkedListMiddle()
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
        node1.next = first;
        first = node1;
    }

    public void displayList()
    {
        Node current_node = first;
        while (current_node!=null)
        {
            System.out.print(current_node.data + " -> ");
            current_node = current_node.next;
        }
        System.out.println(" X ");
    }

    public void findMiddleElement()
    {
        int count = 0, mid = 0, reach = 1;
        Node current_node = first;

        while (current_node!=null)
        {
            count++;
            current_node = current_node.next;
        }

        mid = count/2;

        Node nodeFinder = first;

        if (count > 1)
        {
            while (reach != mid)
            {
                nodeFinder = nodeFinder.next;
                reach++;
            }
                System.out.println("Middle of the element is: " + nodeFinder.next.data);
        }

        else
        {
            System.out.println("Element is: " + nodeFinder.data);
        }
    }
}

class App {
    public static void main(String[] args) {
        SinglyLinkedListMiddle linkedlist1 = new SinglyLinkedListMiddle();

        for(int i = 10; i<=70; i=i+10)
        {
            linkedlist1.insertFirst(i);
        }

        linkedlist1.displayList();
        linkedlist1.findMiddleElement();
    }
}
