class Solution {
    public int[] twoSum(int[] arr, int target) {
        for(int i = 0;i<arr.length;i++){
            int s = 0;
            int e =arr.length-1;
            int x = target-arr[i];
           for(int j = 0;j<arr.length;j++){
            if(i!=j && arr[j] ==x){
                return new int[]{i,j};
            }
           }
        }return new int[]{-1,-1};
        
    }
}