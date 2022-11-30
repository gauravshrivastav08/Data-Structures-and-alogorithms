package practicequestions.Array;

// To find a unique element you can use XOR operator
// In XOR Operator same numbers gives output as 0 and different numbers gives output as 1
// for example:
// 0 XOR 0 = 0
// 0 XOR 1 = 1
// 1 XOR 0 = 1
// 1 XOR 1 = 0

// In programming XOR is represented as " ^ "

public class UniqueElement {

    public static void main(String[] args) {
        int a[] = {5,5,2,6};
        findUniqueElement(a);
    }

    public static void findUniqueElement(int a[])
    {
        int unique = 0;
        int length = a.length;

        for(int val : a)
        {
            System.out.println("Value is : "+ val);
            System.out.println("First unique value is : " + unique);

            System.out.print(unique + "^" +  val + " is " );
            unique = (unique^val);
            System.out.println(unique);
            System.out.println();
        }


        int x = 5;
        int y = 7;

    }
}
