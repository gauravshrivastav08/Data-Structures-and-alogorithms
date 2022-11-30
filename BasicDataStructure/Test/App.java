package dataStructure.BasicDataStructure.Test;

public class App {

    public static void main(String[] args)
    {
        BST Obj1 = new BST();
//        Obj1.findMaxKey();
//        Obj1.findMinKey();

        Obj1.insert(1000, "Thirty");
        Obj1.insert(40, "Fourty");
        Obj1.insert(19, "ninteen");
        Obj1.insert(21, " Twenty One");
        Obj1.insert(25, "twenty five");
        Obj1.insert(17, "Seventeen");

//        Obj1.findMaxKey();
//        Obj1.findMinKey();

        Obj1.remove(17);
        Obj1.remove(19);
        Obj1.findMinKey();
    }
}