class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> x = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
            int value = nums[i]-1;
            if(nums[i] != nums[value]){
                swap(nums,i,value);
            }else{
                i++;
            }
        }
        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j+1){
                x.add(nums[j]);
            }
        }
        return x;
        
    }
    static void swap(int[] arr,int s,int e){
        int t = arr[s];
        arr[s] = arr[e];
        arr[e] = t;
    }
}