class Solution {
    public int longestMountain(int[] arr) {
        int max = 0;
        int n = arr.length-1;

        for(int i = 1;i<n;i++){

            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){

            int left = i;
            int right = i;
            while(left>0 && arr[left]>arr[left-1]){
                left--;
            }
            while(right<n && arr[right ]>arr[right+1]){
                right++;
            }
            int len = right -left+1;
            max = Math.max(len,max);
        }
        
        }return max;

        
    }
}