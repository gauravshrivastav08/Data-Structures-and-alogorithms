package dataStructure.BasicDataStructure.DataStructure.NonLinearDS.Tree;

public class BinarySearchTree {
    private Node root;
    public void insert(int key, String value)
    {
        Node node1 = new Node(key, value);
        if(root == null)
        {
            root = node1;
        }
        else {
            Node current_node = root;
            Node parent;

            while(true)
            {
                parent = current_node;
                if(key < current_node.key)
                {
                    current_node = current_node.leftChild;
                    if (current_node == null)
                    {
                        parent.leftChild = node1;
                        return;
                    }
                }
                else {
                    current_node = current_node.rightChild;
                    if(current_node == null)
                    {
                        parent.rightChild = node1;
                        return;
                    }
                }
            }


        }
    }

    public Node findMin()
    {
        Node current_node = root;
        Node last = null;

        while (current_node !=null)
        {
            last = current_node;
            current_node = current_node.leftChild;
        }
        return last;
    }

    public Node findMax()
    {
        Node current_node = root;
        Node last = null;

        while(current_node != null)
        {
            last = current_node;
            current_node = current_node.rightChild;
        }
        return last;
    }

    public void remove(int key)
    {
        Node current_node = root;
        Node parent = null;
        boolean isleftChild = false;

        while (key != current_node.key)
        {
            parent = current_node;
            if(key < current_node.key)
            {
                current_node = current_node.leftChild;
                isleftChild = true;
            }
            else {
                current_node = current_node.rightChild;
                isleftChild = false;
            }

            if (current_node == null)       // we didn't find the key to be deleted from Binary-tree
            {
                return;
            }
        }

        // Here we found the node which need to be deleted
        Node nodeToDelete = current_node;

        // If node is leaf node
        if(nodeToDelete.leftChild == null && nodeToDelete.rightChild == null)
        {
            if(root == nodeToDelete)
            {
                root = null;
            }

            else {
                if(isleftChild)
                {
                    parent.leftChild = null;
                }
                else parent.rightChild = null;
            }
        }

        // If node to be deleted is having one left child node

        else if(nodeToDelete.rightChild == null)
        {
            if (isleftChild) {
                parent.leftChild = nodeToDelete.leftChild;
            }
            else parent.rightChild = nodeToDelete.leftChild;
        }

        // If node to be deleted is having one right child node

        else if (nodeToDelete.leftChild == null)
        {
            if(isleftChild)
            {
                parent.leftChild = nodeToDelete.rightChild;
            }
            else parent.rightChild = nodeToDelete.rightChild;
        }

    }
}
