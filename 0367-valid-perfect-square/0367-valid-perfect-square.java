class Solution {
    public boolean isPerfectSquare(int num) {
        int s = 2 ;
        int e = num/2;
        if(num==1||num==0){
            return true;
        }
        while(s<=e){
            int m = s + (e-s)/2;
            long a = (long)m*m;
            if(a == num){
                return true;
            }else if (a>num){
                e = m-1;
            }else{
                s =m+1;
            }
        }return false;
        
    }
}