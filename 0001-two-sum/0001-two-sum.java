class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Brute Force - O(n^2)
        // int[] result = new int[2];
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if((nums[i]+nums[j])==target)
        //         {
        //             result[0]=i;
        //             result[1]=j;
        //             break;
        //         }
        //     }
        // }
        // return result;
        
        // Using Hashing - O(n)
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int remaining = target - nums[i];
            
            if(map.containsKey(remaining))
            {
                result[0]=map.get(remaining);
                result[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}