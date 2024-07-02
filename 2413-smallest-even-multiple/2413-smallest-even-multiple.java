class Solution {
    public int smallestEvenMultiple(int n) {
        int result=0;
        for(int i=2;i<=n*2;i++)
        {
            if(i%2==0 & i%n==0)
            {
                result=i;
                break;
            }
        }
        return result;
    }
}