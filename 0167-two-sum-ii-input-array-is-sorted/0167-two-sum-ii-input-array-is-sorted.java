class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int []ans =new int[2];
        for(int i = 0;i<numbers.length;i++){
            int x = target - numbers[i];
            int s = i+1;
            int e = numbers.length-1;
            while(s<=e){
                int m = s+(e-s)/2;
                if(numbers[m]==x){
                    ans[0] = i+1;
                    ans[1] = m+1;
                    return ans;
                }else if(numbers[m]>x){
                    e=m-1;
                }else{
                    s = m+1;
                }
            }
        }return new int[] {-1,-1};

    }
}