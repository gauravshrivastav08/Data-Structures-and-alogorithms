package practicequestions.GeneralQuestions;

public class Factorial {
    public static void main(String[] args) {
        simpleFactorialMethod(5);
        int recur = recursionFactorial(5);
        System.out.println("Factorial of 5 by recursion method is: " + recur);
    }

    public static void simpleFactorialMethod(int num)
    {
        int fact = 1;

        for(int i=1; i<=num; i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
    }

    public static int recursionFactorial(int num)
    {
        if(num>=1)
            return (num * recursionFactorial(num-1));
        else
            return 1;
    }
}
