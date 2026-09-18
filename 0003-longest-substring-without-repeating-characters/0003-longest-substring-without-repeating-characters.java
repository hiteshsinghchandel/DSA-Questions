class Solution {
    public int lengthOfLongestSubstring(String s) {
          int len = 0;
        int i =0;

        for (int j = 0; j < s.length(); j++) {
            while (s.substring(i,j).contains(""+s.charAt(j))){
                i++;
            }
            len = Math.max(len,j-i+1);
        }return len;
    }
}