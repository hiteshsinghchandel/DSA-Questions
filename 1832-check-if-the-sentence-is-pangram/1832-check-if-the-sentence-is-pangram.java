class Solution {
    public boolean checkIfPangram(String sr) {
          char[] arr = sr.toCharArray();
        int count =0;
        boolean[] seen = new boolean[26];
        if(arr.length<26){
            return false;
        }else{
            for (int i = 0; i < arr.length ; i++) {
                char ch = sr.charAt(i);
                if(arr[i]>='a'&& arr[i]<='z'){
                    int index = ch - 'a';
                    if(!seen[index]){
                        seen[index] = true;
                        count++;
                    }

                }

            }if(count==26){
                return true;
            }
        }return count ==26;
    

        
    }
}