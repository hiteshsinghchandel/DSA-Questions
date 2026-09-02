class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> a = laters("",digits);
        return a;
         
    }
   static ArrayList<String> laters(String p ,String up){
        if(up.isEmpty()){
            ArrayList<String> a = new ArrayList<>();
            a.add(p);
            return a;
        }

        String[] mapping = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        ArrayList<String> s = new ArrayList<>();
        int ch = up.charAt(0) -'0';
        String la = mapping[ch];
        for(int i =0 ;i<la.length();i++){
            s.addAll(laters(p+la.charAt(i),up.substring(1)));
        }return s;
    }
}