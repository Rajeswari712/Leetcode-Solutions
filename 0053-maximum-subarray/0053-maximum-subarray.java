class Solution {
    public int maxSubArray(int[] nums) {
        // brute force
        // int maximum = Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i;j<nums.length;j++)
        //     {
        //         int sum =0;
        //         for(int k=i;k<=j;k++)
        //         {
        //             sum = sum + nums[k];
        //         }
        //         maximum = Math.max(sum, maximum);
        //     }
        // }
        // return maximum;
        
        int sum =0;
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
            maximum = Math.max(sum, maximum);
            if(sum<0) sum =0;
        }
        return maximum;
        
    }
}