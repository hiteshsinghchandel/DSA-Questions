class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int v = nums[i]-1;
            if(nums[i] != nums[v]){
                swap(nums,i,v);
            }else{
                i++;
            }
        }
        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j+1){
                return nums[j];
            }

        }return -1;
        
    }
    static void swap(int[] arr,int s,int e){
        int t = arr[s];
        arr[s]= arr[e];
        arr[e]= t;
    }
}