// Majority Element in Array 

class Solution {
    public int majorityElement(int[] nums) {
        
        int majority = nums.length / 2;
        
        if(nums.length == 1)
        {
            return nums[0];
        }
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i : nums)
        {
            if(hm.containsKey(i) && hm.get(i)+1 > majority)
            {
                return i;
            }
            else
            {
                hm.put(i, hm.getOrDefault(i, 0) + 1);
            }
        }
        return -1;
    }
}



class Solution {
    public int majorityElement(int[] nums) {
        
        int majority = nums.length / 2;
        
        if(nums.length == 1)
        {
            return nums[0];
        }
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for(int i : nums)
        {
            if(hm.containsKey(i) && hm.get(i)+1 > majority)
            {
                return i;
            }
            else
            {
                hm.put(i, hm.getOrDefault(i, 0) + 1);
            }
        }
        return -1;
    }
}


class Solution {
    public int majorityElement(int[] nums) {
        
        int count = 0;
        int element = 0;
        
        for(int num : nums)
        {
            if(count == 0)
            {
                element = num;
            }
            if(num == element)
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return element;
        
    }
}