package dataStructure.BasicDataStructure.DataStructure.NonLinearDS.Tree;

public class App {
    public static void main(String[] args) {
        BinarySearchTree Obj1 = new BinarySearchTree();
        Obj1.insert(10,"Ten");
        Obj1.insert(15,"fifteen");
        Obj1.insert(5,"five");
        Obj1.insert(100,"hundred");

        Node min_node= Obj1.findMin();
        System.out.println();
        System.out.println("##########################################");
        System.out.println("Min key in Binary Tree is: " + min_node.key);
        System.out.println("Min value in Binary Tree is: " + min_node.value);
        System.out.println("##########################################");

        Node max_node = Obj1.findMax();
        System.out.println();
        System.out.println("##########################################");
        System.out.println("Max node key in Binary Tree is: " + max_node.key);
        System.out.println("Max node value in Binary Tree is: " + max_node.value);
        System.out.println("##########################################");
    }
}
