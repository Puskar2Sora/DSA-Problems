class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int s=1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
              if(j!=i)
                 s=s*nums[j]; 
            }
            ans[i]=s;
            s=1;
        }
        return ans;
    }
}