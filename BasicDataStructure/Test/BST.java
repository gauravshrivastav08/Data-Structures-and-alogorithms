package dataStructure.BasicDataStructure.Test;

public class BST {

    private Node root;

  public void insert(int key, String value)
  {
      Node node1 = new Node(key, value);
      if(root == null)
      {
          root = node1;
      }

      else
      {
          Node parent = null;
          Node currentnode = root;

          while (true)
          {
              parent = currentnode;
              if(key < currentnode.key)
              {
                  currentnode = currentnode.lefthcild;
                  if(currentnode == null)
                  {
                      parent.lefthcild = node1;
                      return;
                  }
              }
              else
              {
                  currentnode = currentnode.rightchild;
                  if (currentnode == null)
                  {
                      parent.rightchild = node1;
                      return;
                  }
              }

          } // end of While
      }
  } // end of Insert function

    public void findMinKey()
    {
        if (root == null)
        {
            System.out.println("There is no Node in Binary Tree, returned by MinKey Function");
        }

        else
        {
            Node currentNode = root;
            Node parent = null;

            while (currentNode != null)
            {
                parent = currentNode;
                currentNode = currentNode.lefthcild;
            }
            System.out.println("Min Key in Binary Tree is: " + parent.key);
        }
    } // end of findMinKey function

    public void findMaxKey()
    {
        if (root == null)
        {
            System.out.println("There is no Node in Binary Tree, returned by MaxKey Function");
        }
        else
        {
            Node currentNode = root;
            Node parent = null;

            while (currentNode != null)
            {
                parent = currentNode;
                currentNode = currentNode.rightchild;
            }
            System.out.println("Max Key in Binary Tree is: " + parent.key);
        }
    }

  public void remove(int key)
  {
      Node currentNode = root;
      Node parentNode = root;
      boolean isLeftChild = false;

      while (key != currentNode.key)
      {
          parentNode = currentNode;

          if (key < currentNode.key)
          {
            currentNode = currentNode.lefthcild;
            isLeftChild = true;
          }
          else
          {
              currentNode = currentNode.rightchild;
              isLeftChild =false;
          }

          if (currentNode == null)
          {
              System.out.println("Searched key" + key + " is not found in Binary Tree");
              return;
          }
      }

      // Now we found the key to be deleted
      Node nodeToDelete = currentNode;

      // if node is a leaf node
      if (nodeToDelete.lefthcild == null && nodeToDelete.rightchild == null)
      {
          if (nodeToDelete == root)
          {
              root = null;
          }
         else if (isLeftChild)
              parentNode.lefthcild = null;
          else
              parentNode.rightchild = null;
      }


      // If node to be deleted having a right child
      else if (nodeToDelete.rightchild != null && nodeToDelete.lefthcild == null)
      {
          if (nodeToDelete == root)
          {
              root = nodeToDelete.rightchild;
          }
          else if (isLeftChild)
              parentNode.lefthcild = nodeToDelete.rightchild;
          else
              parentNode.rightchild = nodeToDelete.rightchild;
      }

      // If node to be deleted having a left child
      else if(nodeToDelete.lefthcild!= null && nodeToDelete.rightchild == null)
      {
          if (nodeToDelete == root)
          {
              root = nodeToDelete.lefthcild;
          }
          if (isLeftChild)
              parentNode.lefthcild = nodeToDelete.lefthcild;
          else
              parentNode.rightchild = nodeToDelete.lefthcild;
      }

      else
      {
          Node successor = getSuccessor(nodeToDelete); // This is in-order successor

          // Connect parent of nodeToDelete to Successor node
          if(nodeToDelete == root)
              root = successor;
          else
          {
              if (isLeftChild)
                  parentNode.lefthcild = successor;

              else
                  parentNode.rightchild = successor;

              successor.lefthcild = nodeToDelete.lefthcild;
          }
      }
  }

  public Node getSuccessor(Node nodeToDelete)
  {
    Node SuccessorParent = nodeToDelete;
    Node Successor = nodeToDelete;
    Node CurrentNode = nodeToDelete.rightchild;

    while (CurrentNode!=null)
    {
        SuccessorParent = Successor;
        Successor = CurrentNode;
        CurrentNode = CurrentNode.lefthcild;
    }

    if (Successor!=nodeToDelete.rightchild)
    {
        SuccessorParent.lefthcild = Successor.rightchild;
        Successor.rightchild = nodeToDelete.rightchild;
    }
    return Successor;
  }

}
