// A party has been organised on cruise. The party is organised for a limited time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.

import java.io.*;

class P4
{

    static void setUpArr(Console c, int time, int[] enterArr, int[] exitArr)
    {
        for (int i = 0; i < time; i++) {
            enterArr[i] = Integer.parseInt(c.readLine("Enter guests entering: "));
            exitArr[i] = Integer.parseInt(c.readLine("Enter guests exiting: "));
        }
    }
    
    static int maxGuests(int time, int[] enterArr, int[] exitArr) 
    {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < time; i++)
        {
            curr = curr + enterArr[i] - exitArr[i];
            if (curr > max) 
            {
                max = curr;
            }
        }
        return max;
    }
    
    public static void main(String args[])
    {
        Console c = System.console();
        int time = Integer.parseInt(c.readLine("Enter Time: "));

        int[] enterArr = new int[time];
        int[] exitArr = new int[time];

        setUpArr(c, time, enterArr, exitArr);
        
        int result = maxGuests(time, enterArr, exitArr);

        System.out.println(result);

    }
}