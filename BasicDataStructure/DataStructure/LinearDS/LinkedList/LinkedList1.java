package dataStructure.BasicDataStructure.DataStructure.LinearDS.LinkedList;


// Count of Nodes

class Node {
    int data;
    Node next = null;
}

public class LinkedList1 {
    public static void main(String[] args) {
        Node node1 = new Node();
        node1.data = 10;

        Node node2 = new Node();
        node2.data = 20;

        Node node3 = new Node();
        node3.data = 30;

        Node node4 = new Node();
        node4.data = 40;

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null; // Not required

        listLength(node1);
        listLength(node2);
        listLength(node3);
        listLength(node4);
    }

    public static void listLength(Node node)
    {
        int counter=1;
        while(node.next !=null)
        {
            counter++;
            node = node.next;
        }
        System.out.println("Length of passed node is " + counter);
    }
}



