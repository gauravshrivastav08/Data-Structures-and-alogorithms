package practicequestions.GeneralQuestions;

// If a number is divided by 1 OR itself, called as Prime number
// 0 and 1 are not considered as Prime number
// 2 is only the even prime number

// Below is a recursive approach

import java.util.Scanner;

public class PrimeNumber {

    static int i = 2;

    public static void main(String[] args) {

        System.out.println("Please enter a number which you find it as a Prime Number ");

        Scanner s1 = new Scanner(System.in);
        int i = s1.nextInt();

        if(isPrime(i))
            System.out.println(i + " is a prime number");
        else
            System.out.println(i + " is not a prime number");
    }

    public static boolean isPrime(int n)
    {
        if(n==0 || n==1)
            return false;

        if(n==i)
            return true;

        if(n%i == 0)
            return false;

        i++;
        return isPrime(n);
    }
}
