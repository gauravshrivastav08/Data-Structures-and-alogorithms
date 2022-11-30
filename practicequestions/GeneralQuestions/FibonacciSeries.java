package practicequestions.GeneralQuestions;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeries(10);
    }

    public static void fibonacciSeries(int n)
    {
        int past = 0;
        int current = 1;
        int fib = 0;

//Here past is a number which traverse to all other numbers i.e. it will have all the old values sos printing this
// number is a best idea, don't try to print "current" and "fib"

        for(int i=0; i<n; i++)
        {
            System.out.print(past + "\t");
            fib = past + current;
            past = current;
            current = fib;
        }
    }
}
