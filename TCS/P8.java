// Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. Print the positive integer value after toggling all bits.

import java.io.*;

class P8 {
    
    public static void main(String[] args)
    {
        Console c = System.console();

        int decimal = Integer.parseInt(c.readLine("Enter n: "));
        int[] binaryArr = new int[40];
        int index = -1;
        while(decimal > 0)
        {
            index = index + 1;
            binaryArr[index] = decimal % 2;
            decimal = decimal / 2;
        }
        for(int i=index; i>=0; i--)
        {
            System.out.print(binaryArr[i]);
        }
        for(int i=index; i>=0; i--)
        {
            if (binaryArr[i] == 0)
                binaryArr[i] = 1;
            else
                binaryArr[i] = 0;
        }
        System.out.println();
        String result = "";
        for(int i=index; i>=0; i--)
        {
            System.out.print(binaryArr[i]);
            result = result + binaryArr[i];
        }


    }

}
