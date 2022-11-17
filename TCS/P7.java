// A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).

import java.io.*;

class P7 {
    
    public static void main(String args[])
    {
        Console c = System.console();

        int n = Integer.parseInt(c.readLine("Enter n: "));

        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = Integer.parseInt(c.readLine("Enter number: "));
        }

        int index = 0;
        for(int i=0; i<n; i++)
        {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index += 1;
            }
        }

        for(int i=index; i<n; i++)
        {
            arr[i] = 0;
        }

        for(int i: arr)
            System.out.println(i);
    }

}
