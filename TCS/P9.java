// So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, be it Sunday, Monday…. Or so on. Count the number of Sunday jack will get within n number of days.

import java.util.*;
class Main
{
public static void main(String[] args)
{
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        String arr[]={"mon","tue,","wed","thu","fri","sat","sun"};
        int i=0;
        for(i=0;i< arr.length;i++)
            if(arr[i].equals(str))
            break;
        int res=1;
        int rem=6-i;
        n=n-rem;    
        if(n >0)
            res+=n/7;
        System.out.println(res);

}
}