class Solution {
    public boolean increasingTriplet(int[] nums) {
        int f=Integer.MAX_VALUE;
        int s=Integer.MAX_VALUE;
        for(int i:nums)
        {
         if(i<=f) f=i;
         else if(i<=s) s=i;
         else return true;
        }
        return false;
    }
}