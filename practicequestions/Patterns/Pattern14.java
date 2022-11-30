package practicequestions.Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        tablePrint(2);
    }

    public static void tablePrint(int n)
    {
        for (int i=1; i<=10; i++)
        {
            System.out.println(n + " * " + i + " = " + n*i);
        }
    }
}
