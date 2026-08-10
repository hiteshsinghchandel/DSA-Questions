class Solution {
    public int numberOfSteps(int num) {
        int a = steps(num,0);
        return a;
        
    }

    static int steps(int n ,int s){
        if(n==0){
            return s;
        }
        int a = 0;
        if(n%2==0){
            a = a+1;
            
            return steps(n/2,s =s+a);
        }else{
            a = a+1;
            return steps(n-1,s = s+a);
        }
    }
}