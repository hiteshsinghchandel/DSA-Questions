class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] x = new int[2];
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
                x[0] = nums[j];
                x[1] = j+1;
            }
        }

        return x;

        
    }
    static void swap(int[] arr,int s ,int e){
        int t = arr[s];
        arr[s] = arr[e];
        arr[e] = t;
    }
}