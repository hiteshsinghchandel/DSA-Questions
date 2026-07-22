class Solution {
    public void sortColors(int[] nums) {
        for(int i =0;i<nums.length-1;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    swap(nums,i,j);
                    
                }
            }
        }
        
    }static void swap(int[]arr,int s,int e){
        int t = arr[s];
        arr[s]= arr[e];
        arr[e]= t;
    }
}