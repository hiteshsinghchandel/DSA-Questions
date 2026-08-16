class Solution {
    public String greatestLetter(String s) {
    String u = "";
    String l = "";
    String ans = "";

    for (int i = 0; i < s.length(); i++) {

        if (Character.isUpperCase(s.charAt(i))) {
            u = u + s.charAt(i);
        } else {
            l = l + s.charAt(i);
        }
    }

    for (int i = 0; i < u.length(); i++) {
        for (int j = 0; j < l.length(); j++) {

            if (Character.toLowerCase(u.charAt(i)) == l.charAt(j)) {

                if (ans.isEmpty() || u.charAt(i) > ans.charAt(0)) {
                    ans = String.valueOf(u.charAt(i));
                }
            }
        }
    }

    return ans;

        
    }
    // static String occ(String s) {
    // String u = "";
    // String l = "";
    // String ans = "";

    // for (int i = 0; i < s.length(); i++) {

    //     if (Character.isUpperCase(s.charAt(i))) {
    //         u = u + s.charAt(i);
    //     } else {
    //         l = l + s.charAt(i);
    //     }
    // }

    // for (int i = 0; i < u.length(); i++) {
    //     for (int j = 0; j < l.length(); j++) {

    //         if (Character.toLowerCase(u.charAt(i)) == l.charAt(j)) {
    //             ans = ans + u.charAt(i);
    //         }
    //     }
    // }

    // return ans;
// }
}