class Solution {
    public String defangIPaddr(String address) {
       String a = address;
       return a.replace(".","[.]");
        
    }
}