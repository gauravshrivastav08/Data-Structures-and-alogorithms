package practicequestions.Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        fibonacciSeries(5);
    }

    public static void fibonacciSeries(int n)
    {
        int past = 0;
        int current = 1;
        int fib = 0;

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print(past + "\t");
                fib = past + current;
                past = current;
                current = fib;
            }
            System.out.println();
        }
    }
}
