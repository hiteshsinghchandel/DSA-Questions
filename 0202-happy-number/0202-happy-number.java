class Solution {
    public boolean isHappy(int n) {
        int f = n;
        int s = n;
        do{
            f = squ(squ(f));
            s = squ(s);

        }while(s !=f);

        return s==1;
        
    }

    static int squ(int n ){
        int ans = 0;
        while(n>0){
            int t = n%10;
            n = n/10;
            ans = ans + t*t;
        }return ans;
    }
}