class Solution {
    public int secondHighest(String s) {
        int l = -1;
        int sm = -1;
        for(char ch : s.toCharArray()){

            if(Character.isDigit(ch)){

                int d = ch -'0';

                if(d>l){
                    sm = l;
                    l=d;
                    
                }else if(d>sm&& d<l ){
                    sm = d;
                }
            }
        }return sm;
        
    }
}