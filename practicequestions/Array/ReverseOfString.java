package practicequestions.Array;

public class ReverseOfString {
    public static void main(String[] args) {
        String Str1 = "Gaurav";
        String Str2 = reverseOfString(Str1);
        findPalindrome(Str1, Str2);
    }

    public static String reverseOfString(String str)
    {
        String rstr="";
        Character ch;
        int length = str.length();

        System.out.println("Passed String is " + str);
        for (int i=0; i<length; i++)
        {
            ch = str.charAt(i);
            rstr = ch + rstr;      // This order is V. Imp, if you write rstr + ch, it will not reverse the thing
        }

        System.out.println("Reverse of the String is: " + rstr);
        return rstr;
    }

    public static void findPalindrome(String str1, String str2)
    {
        if(str1.equalsIgnoreCase(str2))
        {
            System.out.println(str1 + " is a Palindrome String");
        }

        else
            System.out.println(str1 + " is not a Palindrome String");
    }
}
