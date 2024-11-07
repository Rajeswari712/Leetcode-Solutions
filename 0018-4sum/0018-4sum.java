class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // brute force
//         List<List<Integer>> result = new ArrayList<>();
//         int n=nums.length;
//         Set<List<Integer>> uniqueTriplets = new HashSet<>();
//         for(int i=0;i<n;i++)
//         {   
//             for(int j=i+1;j<n;j++)
//             {
//                 for(int k=j+1;k<n;k++)
//                 {
//                     for(int m=k+1;m<n;m++)
//                     {
//                         if((nums[i]+nums[j]+nums[k]+nums[m])==target)
//                         {
//                             List<Integer> triplet = new ArrayList<>();
//                                triplet.addAll(Arrays.asList(nums[i],nums[j],nums[k],nums[m]));
//                             // triplet.add(nums[i]);
//                             // triplet.add(nums[j]);
//                             // triplet.add(nums[k]);
//                             // triplet.add(nums[m]);
//                             triplet.sort(Integer::compareTo);
//                             uniqueTriplets.add(triplet);
//                         }
                        
//                     }
//                 }
//             }
//         }
//         result.addAll(uniqueTriplets);  
//         return result;
        
        // better - hashing
        
//          List<List<Integer>> result = new ArrayList<>();
//          int n=nums.length;
//          Set<List<Integer>> uniqueTriplets = new HashSet<>();
//         for(int i=0;i<n;i++)
//         {
            
//             for(int j=i+1;j<n;j++)
//             {
//                 Set<Integer> set = new HashSet<>();
//                 for(int k=j+1;k<n;k++)
//                 {
//                     long fourth = target - (nums[i]+nums[j]+nums[k]);
//                     if(set.contains(fourth) != set.last())
//                     {
//                         List<Integer> triplet = new ArrayList<>();
//                         triplet.addAll(Arrays.asList(nums[i],nums[j],nums[k],(int)fourth));
//                         triplet.sort(Integer::compareTo);
//                         uniqueTriplets.add(triplet);
                        
//                     }
//                     set.add(nums[k]);
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
            for(int j=i+1;j<n;j++)
            {
                if(j!=i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                int l=n-1;
                while(k<l)
                {
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    if(sum==target)
                    {
                        List<Integer> quad = new ArrayList<>();
                        quad.addAll(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        result.add(quad);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }
                    else if(sum<target) k++;
                    else l--;
                }
            }
        }
        return result;
    }
}