class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        List<Integer> x = new ArrayList<>();
        while(i<nums.length){
            int v = nums[i]-1;
            if(nums[i] != nums[v]){
                swap(nums,i,v);
            }else{
                i++;
            }
        }
        for(int j = 0;j<nums.length;j++){
            if(nums[j]  != j+1){
                x.add(j+1);
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