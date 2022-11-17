// Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.

import java.io.*;

class P1
{
    public static void main(String args[])
    {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter Array Size: "));

        int nums[] = new int[n];
        for(int i=0; i<n; i++)
        {
            nums[i] = Integer.parseInt(c.readLine("Enter Number: "));
        }

        int max = Integer.MIN_VALUE;
        int result = 0;

        for(int i : nums)
        {
            if (i > max) {
                max = i;
                result++;
            }
        }
        
        System.out.println("Count: " + result);
    }
}