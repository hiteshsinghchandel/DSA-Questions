class Solution {
    public int repeatedNTimes(int[] nums) {
            int n = nums.length/2;

        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int c = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j]==a ){
                    c++;
                }

            }if (c==n){
                return a;
            }

        }  return -1;
    }
}