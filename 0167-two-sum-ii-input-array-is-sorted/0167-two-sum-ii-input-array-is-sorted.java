class Solution {
    public int[] twoSum(int[] arr, int target) {
        int s = 0 ;
        int e = arr.length-1;

        while(s<=e){
            int sum = arr[s]+arr[e];
            if(sum==target){
                return new int[]{s+1,e+1};
            }else if(sum<target){
                s++;

            }else{
                e--;
            }
        } return new int[]{-1,-1};      
    }
}