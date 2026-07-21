class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            int a = 0;
            for(int j = 0;j<arr.length;j++){
               if(arr[i]>arr[j]){
                a++;
               }
               
            }ans[i]=a;

        }return ans;
    }
}