// An international round table conference will be held in india. Presidents from all over the world representing their respective countries will be attending the conference. The task is to find the possible number of ways(P) to make the N members sit around the circular table such that. The president and prime minister of India will always sit next to each other.

import java.util.*;
import java.math.*;

class P11 {

    static BigInteger fact(int n)
    {
        BigInteger res = BigInteger.ONE;

        for(int i=n; i>0; i--)
        {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger res = fact(n - 1);
        res = res.multiply(BigInteger.valueOf(2));
        
        System.out.println(res);
        sc.close();
    }

}
