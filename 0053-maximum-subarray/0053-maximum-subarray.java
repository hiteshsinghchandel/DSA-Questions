class Solution {
    public int maxSubArray(int[] nums) {
        int n= nums.length;
        int x = nums[0];
        int cusum = 0;

         
        for(int i =0;i<n;i++){
            cusum = cusum + nums[i];
            if(cusum >x){
                x = cusum;
            }if(cusum<0){
                cusum =0;
            
            }
        }
        return x;
    }
}