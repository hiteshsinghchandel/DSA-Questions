class Solution {
    public int[] getConcatenation(int[] nums) {
        int x = 2 *nums.length;
        int []ans = new int[x];
        for(int i = 0;i<nums.length;i++){
            ans[i]=nums[i];
        }
        for(int i = nums.length;i<x;i++){
            ans[i]=nums[i%nums.length];
        }
        return ans;
        
    }
}