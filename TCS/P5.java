// At a fun fair, a street vendor is selling different colours of balloons. He sells N number of different colours of balloons (B[]). The task is to find the colour (odd) of the balloon which is present odd number of times in the bunch of balloons.

import java.io.*;
import java.util.*;

public class P5 {
    
    public static void main(String[] args)
    {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter N: "));

        char[] arr = new char[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = c.readLine("Enter color: ").charAt(0);
        }

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < n; i++) 
        {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        
        boolean flag = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) 
        {
            if (entry.getValue() % 2 == 1) {
                System.out.println(entry.getKey());
                flag = true;
                break;
            }
        }
        if(flag == false)
        {
            System.out.println("All are even");
        }
    }
}
