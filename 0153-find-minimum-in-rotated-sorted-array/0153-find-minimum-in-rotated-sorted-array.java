class Solution {
    public int findMin(int[] nums) {
     int p = pivot(nums);
        if(p == nums.length-1){
            return nums[0];
        }else{
            return nums[p+1];
        }
        
    }
     static int pivot(int[] arr){

        int s = 0;
        int e = arr.length-1;

        while (s<e) {
            int m = s + (e - s) / 2;

            if (m<e && arr[m]>arr[m+1]){
                return m;
            }
            if (m>s && arr[m]<arr[m-1]){
                return m-1;
            }
            if (arr[s]<=arr[m]){
                s = m+1;
            }else {
                e = m-1;
            }
        }

        return s;
    }
}