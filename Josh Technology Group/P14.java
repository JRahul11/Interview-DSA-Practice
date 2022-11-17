
class P14
{
    public static void main(String[] args)
    {
        int[] nums = { 14, 12, 70, 15, 95, 13, 22, 30 };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for(int num : nums)
        {
            if (max < num)
                max = num;
            if (min > num)
                min = num;
            else if (second_min > num)
                second_min = num;
        }
        System.out.println(max + " " + min + " " + second_min);
    }
}