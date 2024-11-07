class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // brute force
        int m=nums1.length;
        int n=nums2.length;
        int[] arr = new int[m+n];
        int i=0,j=0, k=0;
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                arr[k]=nums1[i];
                
                i++;
            }
            else
            {
                arr[k]=nums2[j];
                
                j++;
            }
            k++;
        }
        while(i<m)
        {
            arr[k]=nums1[i];
            k++;
            i++;
        }
        while(j<n)
        {
            arr[k]=nums2[j];
            k++;
            j++;
        }
        for(int p=0;p<m+n;p++)
        {
            System.out.print(arr[p]+" ");
        }
        int l=m+n;
        if(l%2==0)
        {
            return (double)(arr[l/2]+arr[(l/2)-1])/2;
        }
        else
        {
            return arr[l/2];
        }
        
        
    }
}