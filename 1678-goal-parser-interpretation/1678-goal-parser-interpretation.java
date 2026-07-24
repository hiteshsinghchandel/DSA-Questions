class Solution {
    public String interpret(String command) {
        String x = command.replace("()","o");
        String g = x.replace("(al)","al");
        return g;
        
    }
}