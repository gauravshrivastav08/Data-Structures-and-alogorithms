package practicequestions.GeneralQuestions;

/*
Natural number in Math is a positive integer number i.e. 1,2,44,55,100 are Natural numbers
where -1, -45, 0.35 are not natural numbers
*/

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        System.out.println("Please enter the Natural number:");
        Scanner s1 = new Scanner(System.in);
        int i = s1.nextInt();
        if(i >0)
            sumOfNaturalNumbers(i);
        else
            System.out.println("Please enter the positive number");
    }

    public static void sumOfNaturalNumbers(int n)
    {
        int sum = ((n) * (n+1))/2;
        System.out.println("Sum of natural number " + n + " is " + sum);
    }
}
