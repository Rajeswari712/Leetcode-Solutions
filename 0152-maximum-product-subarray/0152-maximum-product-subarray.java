class Solution {
    public int maxProduct(int[] nums) {
        // brute force
//         int maximum = Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++)
//         {
//             int product = 1;
//             for(int j=i;j<nums.length;j++)
//             {
//                 product *= nums[j];
//                 maximum = Math.max(maximum, product);
//             }
            
//         }
//         return maximum;
        int prefix = 1, suffix = 1;
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(prefix==0) prefix = 1;
            if(suffix==0) suffix = 1;
            prefix = prefix * nums[i];
            suffix = suffix * nums[nums.length-i-1];
            maximum = Math.max(maximum, Math.max(prefix,suffix));
        }
        return maximum;
     }
}