class Solution {
    public int maxProfit(int[] arr) {
        
        int minp = arr[0];
        int maxprofit = 0;
        for(int i = 1;i<arr.length;i++){
            if(minp>arr[i]){
                minp = arr[i];
            }
            int profit = arr[i]-minp;
            if(profit>maxprofit){
                maxprofit = profit;
            }
        }
        return maxprofit;
    }
}