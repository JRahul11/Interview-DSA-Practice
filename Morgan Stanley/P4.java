// Maximum Occuring Character

class Solution
{
    static final int ASCII_VALUE = 128;
    
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        int[] count = new int[ASCII_VALUE];
        
        int len = line.length();
        for(int i=0; i<len; i++)
        {
            count[line.charAt(i)]++;
        }
        
        int max = Integer.MIN_VALUE;
        char result = ' ';
        
        int index = 0;
        for(int i=0; i<ASCII_VALUE; i++)
        {
            if(max < count[i])
            {
                max = count[i];
                result = (char)index;
            }
            index++;
        }
        return result;
    }
    
}