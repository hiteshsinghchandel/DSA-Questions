class Solution {
    public long countSubarrays(int[] nums, long k) {
        if(k<=1){
            return 0;
        }

        return sum(nums,k);
        
    }
      static  long sum (int []arr,long k){
        int left =0;
        long sum = 0;
        long m = 0;

        for (int i = 0; i < arr.length ; i++) {

           sum = sum+arr[i];
           long l = i-left+1;

           while (left<=i && (sum*l)>=k){
               sum = sum-arr[left];
               left++;
               l = i-left+1;
           }
           m =(m + l);


        }return  m;
    }
}