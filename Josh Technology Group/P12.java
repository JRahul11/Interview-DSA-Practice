import java.util.*;

class P12 {
    public static void main(String[] args) {
        String str = "aabbbbaaaabbbbaaa";
        char[] strArr = str.toCharArray();
        int n = strArr.length;
        int start = 0;
        HashSet <String> set = new HashSet <String>();
        
        while (start < n) 
        {
            int index = start;
            StringBuilder sb = new StringBuilder();
            do 
            {
                sb.append(strArr[index]);
                index = (index + 1) % n;
            } while (index != start);
            
            set.add(sb.toString());
            set.add(sb.reverse().toString());
            start++;
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
