class Solution {
    public int nthMagicalNumber(int n, int a, int b) {

        long lef = Math.min(a,b);
        long rig = (long) n *lef;
          long lcm = (long) a / gcd(a, b) * b;
        while (lef<rig){
            long mid = lef +(rig-lef)/2;
            

            long c = (mid/a )+ (mid/b) - (mid/lcm);

            if (c<n){
                lef = mid+1;
            }else {
                rig = mid;
            }




        }int  mod = 1000000007;
        return  (int)(lef%mod);

    }

    static  int gcd(int a , int b){
        while (b!=0){
            int t = b;
            b = a%b;
            a = t;
        }return  a;
    }
}