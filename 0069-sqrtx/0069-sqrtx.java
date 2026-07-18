class Solution {
    public int mySqrt(int x) {
        int s = 0;
        int e = x/2;
        int ans = 0;
        if(x==0||x==1){
            return x;
        }
     
        
        while(s<=e){
            int m = s +(e-s)/2;
            long a = (long) m*m;
            if(a==x){
                return m;
            }else if(a<x){
                ans = m ;
                s = m+1;
            }else{
                e= m-1;
            }
        }return ans;
        
    }
}
        
     