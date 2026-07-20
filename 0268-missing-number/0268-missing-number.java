class Solution {
    public int missingNumber(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int v = arr[i];
            if(arr[i]<arr.length && arr[i] !=arr[v]){
                swap(arr,i,v);
            }else{
                i++;
            }
        }
        for(int t = 0;t< arr.length; t++){
            if(arr[t] != t){
                return t;
            }
        }
            

       return arr.length;
        }
        
    
    static void swap(int[] arr ,int s ,int e){
        int t = arr[s];
         arr[s] = arr[e];
        arr[e]= t;
    }
}