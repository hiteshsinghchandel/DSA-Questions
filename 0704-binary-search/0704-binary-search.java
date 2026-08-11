class Solution {
    public int search(int[] arr, int target) {
        return bs(arr,target,0,arr.length-1);

        
    }
    static int bs(int[] arr,int t ,int s ,int e){
        if(s>e){
            return -1;
        }
        int m = s+(e-s)/2;
        if(arr[m]==t){
            return m;
        }
        if(arr[s]<arr[m]){
        if(arr[s]<=t && t<=arr[m]){

            return bs(arr,t,s,m-1);
        }else{
            return bs(arr,t,m+1,e);
        }
        
        }if(t>=arr[m] && t<= arr[e]){
            return bs(arr,t,m+1,e);
        }
        return bs(arr,t,s,m-1);
    }
}