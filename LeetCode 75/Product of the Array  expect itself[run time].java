class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        int s=1;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = s;
            s = s * nums[i];
        }
        s = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * s;
            s = s * nums[i];
        }
        return ans;
    }
}