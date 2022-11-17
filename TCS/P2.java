// Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.

import java.io.*;

class P2 
{
    public static void main(String args[])
    {
        Console c = System.console();

        String str = c.readLine("Enter a String consisting of only * and #: ");
        int count = 0;

        for(int i=0; i<str.length(); i++)
        {
            if (str.charAt(i) == '*')
                count++;
            else if (str.charAt(i) == '#')
                count--;
        }
        System.out.println(count);
    }
}
