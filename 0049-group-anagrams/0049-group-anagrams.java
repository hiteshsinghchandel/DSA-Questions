class Solution {
    static List<List<String>> groupAnagrams(String[] arr){
        List<String> l = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            char[] ch = arr[i].toCharArray();
            Arrays.sort(ch);
            String so = new String(ch);
            l.add(so);

        }
        boolean[] use = new boolean[arr.length];
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {

            if(use[i]){
                continue;
            }
            List<String> gr = new ArrayList<>();

            for (int j = i; j < l.size(); j++) {

                if (!use[j] && l.get(i).equals(l.get(j))){
                    gr.add(arr[j]);
                    use[j] = true;

                }


            }ans.add(gr);

        }



        return ans;
    }
}