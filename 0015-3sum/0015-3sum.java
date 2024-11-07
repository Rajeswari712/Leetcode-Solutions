class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // brute force O(n^3)
//         List<List<Integer>> result = new ArrayList<>();
//         Set<List<Integer>> uniqueTriplets = new HashSet<>();
//         for(int i=0;i<nums.length;i++)
//         {
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 for(int k=j+1;k<nums.length;k++)
//                 {
//                     if((nums[i]+nums[j]+nums[k])==0)
//                     {
//                         List<Integer> triplet = new ArrayList<>();
//                         triplet.add(nums[i]);
//                         triplet.add(nums[j]);
//                         triplet.add(nums[k]);
//                         triplet.sort(Integer::compareTo);
                        
//                        uniqueTriplets.add(triplet);
//                     }
//                 }
//             }
//         }
//         result.addAll(uniqueTriplets);
//         return result;
        
        // better - hashing O(n^2)
//         List<List<Integer>> result = new ArrayList<>();
//         Set<List<Integer>> uniqueTriplets = new HashSet<>();
//         for(int i=0;i<nums.length;i++)
//         {
//             Set<Integer> set = new HashSet<>();
//             for(int j=i+1;j<nums.length;j++)
//             {
//                 int third = -(nums[i]+nums[j]);
//                 if(set.contains(third))
//                 {
//                     List<Integer> triplet = new ArrayList<>();
//                     triplet.add(nums[i]);
//                     triplet.add(nums[j]);
//                     triplet.add(third);
                        
//                     triplet.sort(Integer::compareTo);
//                     uniqueTriplets.add(triplet);
//                 }
//             }
//         }
//         result.addAll(uniqueTriplets);
//         return result;
        
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                long sum = nums[i];
                sum+=nums[j];
                sum+=nums[k];
                if(sum==0)
                {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.addAll(Arrays.asList(nums[i],nums[j],nums[k]));
                    result.add(triplet);
                    j++;k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
                else if(sum<0) j++;
                else k--;
            }
        }
        return result;
    }
}