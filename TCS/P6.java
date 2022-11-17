// There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full. At any point of time. JAR can have M number of Candies where M<=N. Candies are served to the customers. JAR is never remain empty as when last k candies are left. JAR if refilled with new candies in such a way that JAR get full. Write a code to implement above scenario. Display JAR at counter with available number of candies. Input should be the number of candies one customer can order at point of time. Update the JAR after each purchase and display JAR at Counter.

import java.io.*;

class P6 {
    
    public static void main(String[] args)
    {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("Enter N: "));
        int k = Integer.parseInt(c.readLine("Enter K: "));
        int num = Integer.parseInt(c.readLine("Enter needed candies: "));

        if(num >=0 && num <= n-k)
        {
            n -= num;
            System.out.println("Number of candies sold: " + num);
            System.out.println("Number of candies in jar: " + n);
        }
        else
        {
            System.out.println("Invalid Input Breh");
        }
    }

}
